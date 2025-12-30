package tr.edu.istiklal;

public class HexClass {
    public static int hex2Dec(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!(hexChar >= '0' && hexChar <= '9') && !(hexChar >= 'A' && hexChar <= 'F')) {
                throw new HexFormatException(hex);
            }
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }


    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
