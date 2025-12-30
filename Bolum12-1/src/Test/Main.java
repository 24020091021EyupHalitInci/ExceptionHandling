package Test;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        String b = "";
        try {
            a = sc.nextLine();
            int ax = Integer.parseInt(a);
            String islem = sc.nextLine();
            b = sc.nextLine();
            int bx = Integer.parseInt(b);
            if(islem.equals("+"))
            {
                System.out.println(ax+" + "+bx+" = "+(ax+bx));
            }
            else if(islem.equals("-"))
            {
                System.out.println(ax+" - "+bx+" = "+(ax-bx));
            }
            else if(islem.equals("*"))
            {
                System.out.println(ax+" * "+bx+" = "+(ax*bx));
            }
            else if(islem.equals("/"))
            {
                System.out.println(ax+" / "+bx+" = "+(ax/bx));
            }else {
                System.out.println("4 islem disinda bir giris yapildi(+,-,*,/)");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + a);
        }
    }
}
