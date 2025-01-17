package task2;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radians: ");
        double radians = scanner.nextDouble();
        int degrees = (int) Math.round(radians * 180 / Math.PI);
        System.out.println("Degrees: " + degrees);
    }
}
