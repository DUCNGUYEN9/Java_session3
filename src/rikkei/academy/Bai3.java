package rikkei.academy;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Tìm ước số chung lớn nhất
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("enter b: ");
        b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a + b;
                System.out.println("a = " + a);
                break;
            } else {
                b = b - a;
                System.out.println("b = " + b);
                break;
            }
        }
        System.out.println("Greatest common factor: " + a);

    }
}
