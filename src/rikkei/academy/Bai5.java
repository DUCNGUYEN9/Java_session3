package rikkei.academy;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Hiển thị các loại hình
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("--------MENU--------");
            System.out.println("1. Print the triangle");
            System.out.println("2. Print the square");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(" --Draw the triangle--");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*   ");
                        }
                        System.out.println();

                    }

                    break;
                case 2:
                    System.out.println("choice  square triangle");
                    System.out.println("1.  top-left");
                    System.out.println("2.  top-right");
                    System.out.println("3.  bottom-left");
                    System.out.println("4.   bottom-right");
                    System.out.print("Enter your choice: ");
                    int square = Integer.parseInt(scanner.nextLine());
                    switch (square) {
                        case 1:
                            System.out.println(" ---Draw the square top-left---");
                            for (int i = 0; i < 6; i++) {
                                for (int j = 6; j > i; j--) {
                                    System.out.print("*  ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println(" ---Draw the square top-right---");
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = i; k < 6; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println(" ---Draw the square bottom-left---");
                            for (int i = 1; i < 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println(" ---Draw the square bottom-right---");
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j <= 6 - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("*");
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
                    break;
                case 3:
                    System.out.println(" ---Print the isosceles triangle---");
                    int k = 0;
                    for (int i = 1; i < 6; i++, k = 0) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print(" ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("*");
                            k++;
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
