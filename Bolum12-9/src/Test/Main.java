package Test;

import tr.edu.istiklal.BinaryConverter;
import tr.edu.istiklal.BinaryFormatException;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.nextLine();
            System.out.println(BinaryConverter.bin2Dec(input));
        }catch (BinaryFormatException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
