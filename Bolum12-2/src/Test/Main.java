package Test;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc  = new Scanner(System.in);
        int a;
        try{
            System.out.println("1-12 arasinda bir deger giriniz.");
            a = sc.nextInt();
            System.out.println(months[a-1]+ " "+ dom[a-1]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Wrong input");
        }
    }
}
