package SubnetMask;
import java.util.Scanner;
public class SubnetMaskConverter {

    public static void main(String[] args) {

        Addresses currentAddress = new Addresses();
        Scanner stdin = new Scanner(System.in);

        while (true)
        {
            try
            {
                System.out.print("\nEnter IP Address: ");
                currentAddress.SetIpAddress(stdin.nextLine());
                System.out.print("Enter Subnet Mask: ");
                currentAddress.SetSubnetMask(stdin.nextLine());

                currentAddress.CalculateAddresses();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("First valid Network Address: " + currentAddress.GetFirstValidNetworkAddress());
//            System.out.println("Last valid Network Address: " + currentAddress.GetLastValidNetworkAddress());
//            System.out.println("Broadcast Address: " + currentAddress.GetBroadcastAddress());
        }
    }
}
