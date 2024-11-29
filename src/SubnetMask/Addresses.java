package SubnetMask;



public class Addresses {
    public void CalculateAddresses() throws Exception {

        _firstValidNetworkAddress = CalcFirstValidNetworkAddress();
        _lastValidNetworkAddress = CalcLastValidNetworkAddress();
    }

    private String CalcLastValidNetworkAddress() throws Exception {
        try
        {
            return "lol";
        }
        catch (Exception e)
        {
            throw new Exception("Error occurred in CalcLastValidNetworkAddress: " + e.getMessage());
        }
    }

    private String CalcFirstValidNetworkAddress() throws Exception {
        try
        {
            StringBuilder firstValidNetworkAddress = new StringBuilder(32);
            for (int x = 0; x < 32; x++)
            {
                if (_bitIpAddress.charAt(x) == '1' && _bitSubnetMask.charAt(x) == '1')
                    firstValidNetworkAddress.append('1');
                else
                    firstValidNetworkAddress.append('0');
            }

            int plusOne = Integer.parseInt(firstValidNetworkAddress.toString(), 2);
            plusOne++;
            return Integer.toBinaryString(plusOne);
        }
        catch (Exception e)
        {
            throw new Exception("Error occurred in CalcFirstValidNetworkAddress: " + e.getMessage());
        }
    }

    private enum AddressType
    {
        IP_ADDRESS,
        SUBNET_MASK,
    }
    public String IpAddress;
    private String _bitIpAddress;
    public String SubnetMask;
    private String _bitSubnetMask;

    private String _firstValidNetworkAddress;
    private String _lastValidNetworkAddress;


    public Addresses() {}

    public String GetFirstValidNetworkAddress() {
        return _firstValidNetworkAddress;
    }

//    public String GetLastValidNetworkAddress() {
//        return _lastValidNetworkAddress;
//    }
//
//    public String GetBroadcastAddress() {
//        return _broadcastAddress;
//    }

    /* setter converts IP Address into binary and sets it to _bitIpAddress
     * only sets, if IP Address is valid */
    public void SetIpAddress(String ipAddress) throws Exception {
        if (ipAddress == null || ipAddress.isEmpty())
            throw new Exception("IP Address should not be empty!");

        _bitIpAddress = GetAddressInBinary(ipAddress, AddressType.IP_ADDRESS);
    }

    /* setter converts Subnet Mask into binary and sets it to _bitSubnetMask
     * only sets, if Subnet Mask is valid */
    public void SetSubnetMask(String subnetMask) throws Exception {
        if (subnetMask == null || subnetMask.isEmpty())
            throw new Exception("Subnet Mask should not be empty!");

        _bitSubnetMask = GetAddressInBinary(subnetMask, AddressType.SUBNET_MASK);
    }

    private String GetAddressInBinary(String address, AddressType addressType) throws Exception {

        String[] octet = address.split("\\.");
        if (octet.length != 4)
            throw new Exception("Address has the wrong format: " + address);

        for (String element : octet)
        {
            int number = Integer.parseInt(element);
            if (number < 0 || number > 255)
                throw new Exception("Address has the wrong format: " + address + "\nAll digits must be in the range 0-255");
        }

        String binary = OctetToBinary(octet);
        if (addressType == AddressType.SUBNET_MASK)
            ThrowIfSubnetMaskInvalid(binary);

        return binary;
    }

    private String OctetToBinary(String[] octet) {
        StringBuilder binaryOctet = new StringBuilder();

        for (String element : octet)
        {
            int number = Integer.parseInt(element);
            binaryOctet.append(Integer.toBinaryString(number));
        }
        return binaryOctet.toString();
    }

    private void ThrowIfSubnetMaskInvalid(String binaryOctet) throws Exception {
        int firstZero = binaryOctet.indexOf('0');

        if (firstZero == -1) // has no 0's at all
            return; // TODO: broadcast, valid mask?

        if (firstZero == 0)
            throw new Exception("Address has the wrong format: " + binaryOctet + "\nSubnet Mask should not have a leading zero");

        int followingOne = binaryOctet.indexOf('1', firstZero);
        if (followingOne == -1)
            return; // has no more 1's after a 0

        throw new Exception("Subnet Mask has the wrong format: " + binaryOctet);
    }
}
