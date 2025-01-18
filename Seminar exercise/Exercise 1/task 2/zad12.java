package task2;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter strawberry price per kg: ");
        double strawberryPrice = scanner.nextDouble();
        System.out.print("Enter bananas kg: ");
        double bananasKg = scanner.nextDouble();
        System.out.print("Enter oranges kg: ");
        double orangesKg = scanner.nextDouble();
        System.out.print("Enter raspberries kg: ");
        double raspberriesKg = scanner.nextDouble();
        System.out.print("Enter strawberries kg: ");
        double strawberriesKg = scanner.nextDouble();
        double raspberryPrice = strawberryPrice / 2;
        double orangePrice = raspberryPrice * 0.6;
        double bananaPrice = raspberryPrice * 0.2;
        double total = (strawberryPrice * strawberriesKg) + (bananaPrice * bananasKg) + (orangePrice * orangesKg) + (raspberryPrice * raspberriesKg);
        System.out.printf("Total price: %.2f lv\n", total);
    }
}
