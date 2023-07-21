package rikkei.academy;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Thiết kế menu cho ứng dụng
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("--------MENU--------");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(" --Draw the triangle--");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println(" --Draw the square--");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*   ");
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    System.out.println(" --Draw the rectangle--");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*   ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("No choice");
            }
        }
    }
}
