package task2;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in cm: ");
        int length = scanner.nextInt();
        System.out.print("Enter width in cm: ");
        int width = scanner.nextInt();
        System.out.print("Enter height in cm: ");
        int height = scanner.nextInt();
        System.out.print("Enter percentage filled: ");
        double percentFilled = scanner.nextDouble();
        double volume = length * width * height / 1000.0; // обем в литри
        double waterNeeded = volume * (1 - percentFilled / 100);
        System.out.printf("Water needed: %.2f liters\n", waterNeeded);
    }
}
