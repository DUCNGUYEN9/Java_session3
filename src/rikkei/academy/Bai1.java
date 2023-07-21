package rikkei.academy;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Kiểm tra số nguyên tố
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 2) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d là số nguyên tố", number);
            } else {
                System.out.printf("%d không phải là số nguyên tố", number);
            }

        } else {
            System.out.printf("%d không phải là số nguyên ", number);
        }
    }
}
