package task2;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double deposit = scanner.nextDouble();
        System.out.print("Enter deposit period in months: ");
        int months = scanner.nextInt();
        System.out.print("Enter annual interest rate: ");
        double interestRate = scanner.nextDouble();
        double totalAmount = deposit + months * ((deposit * interestRate / 100) / 12);
        System.out.printf("Total amount: %.2f\n", totalAmount);
    }
}
