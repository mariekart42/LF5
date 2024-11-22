package SubnetMask;
import java.util.Scanner;
public class SubnetMaskConverter {
    public static enum TypeOfAddress
    {
        IP_ADDRESS,
        SUBNET_MASK,
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String ipAddress, subnetMask;

        while (true)
        {
            System.out.print("\nEnter IP Address: ");
            ipAddress = stdin.nextLine();
            System.out.print("Enter Subnet Mask: ");
            subnetMask = stdin.nextLine();

            /*if (IsInvalidNumberOctet(ipAddress, TypeOfAddress.IP_ADDRESS))
            {
                System.out.println("\nInvalid IP Address!\n\nTry again...");
                continue;
            }*/

            if (IsInvalidNumberOctet(subnetMask, TypeOfAddress.SUBNET_MASK))
            {
                System.out.println("\nInvalid Subnet Mask!\n\nTry again...");
                continue;
            }




        }
    }

    private static boolean IsValidSubnetMask(String[] subnetMask)
    {
        String binaryOctet = GetOctetToBinary(subnetMask);
        System.out.println(binaryOctet);

        int firstZero = binaryOctet.indexOf('0');
        System.out.println("First Zero: " + firstZero);
        if (firstZero == -1)
            return true; // TODO: broadcast, valid mask?

        if (firstZero == 0)
            return false; // leading 0 is not valid subnet mask

        int followingOne = binaryOctet.indexOf('1', firstZero);
        System.out.println("Following One: " + followingOne);

        if (followingOne == -1)
            return true;

        return false;
    }

    private static boolean IsInvalidNumberOctet(String numberOctet, TypeOfAddress addressType)
    {
        try
        {
            String[] octet = numberOctet.split("\\.");
            if (octet.length != 4)
                return true;

            for (String element : octet)
            {
                int number = Integer.parseInt(element);
                if (number < 0 || number > 255)
                    return true;
            }
            if (addressType == TypeOfAddress.SUBNET_MASK)
                return !IsValidSubnetMask(octet);
            return false;
        }
        catch (Exception e)
        {
            return true;
        }
    }

    public static String GetOctetToBinary(String[] octet)
    {
        StringBuilder binaryOctet = new StringBuilder();

        for (String element : octet)
        {
            binaryOctet.append(GetNumToByte(Integer.parseInt(element)));
        }
        return binaryOctet.toString();
    }

    private static String GetNumToByte(Integer num)
    {
        StringBuilder myByte = new StringBuilder();

        int step = 128;
        while (step > 0)
        {
            if (num >= step)
            {
                myByte.append("1");
                num -= step;
            }
            else
                myByte.append("0");
            step /= 2;
        }
        return myByte.toString();
    }

}
