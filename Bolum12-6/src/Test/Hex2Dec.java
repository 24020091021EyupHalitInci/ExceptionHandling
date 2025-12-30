package Test;

import java.util.Scanner;

public class Hex2Dec {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();

        try {
            int result = hex2Dec(hex.toUpperCase());
            System.out.println("The decimal value for hex number " + hex + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int hex2Dec(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }


    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            throw new NumberFormatException("Geçersiz karakter: " + ch);
        }
    }
}
