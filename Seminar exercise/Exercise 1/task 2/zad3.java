package task2;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();
        double cm = inches * 2.54;
        System.out.printf("%.2f inches is %.2f cm\n", inches, cm);
    }
}
