package task2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        double usd = scanner.nextDouble();
        double bgn = usd * 1.79549;
        System.out.printf("%.2f USD is %.2f BGN\n", usd, bgn);
    }
}
