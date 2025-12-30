package Test;

import tr.edu.istiklal.HexClass;
import tr.edu.istiklal.HexFormatException;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.nextLine();
            int decimal = HexClass.hex2Dec(input);
            System.out.println("Hex: " + input + " = Decimal: " + decimal);
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
