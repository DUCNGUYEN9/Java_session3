package rikkei.academy;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Ứng dụng tính tiền lãi cho vay
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of months: ");
        money = Integer.parseInt(scanner.nextLine());
        System.out.println("enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;

        }
        System.out.println("Total of interest " + totalInterest);

    }
}
