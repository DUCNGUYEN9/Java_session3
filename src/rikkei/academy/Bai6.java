package rikkei.academy;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        //Hiển thị 20 số nguyên tố đầu tiên
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 2) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(n + " ");
                count++;
            }
            n++;

        }

    }
}
