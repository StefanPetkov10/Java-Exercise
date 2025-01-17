package task2;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of dogs: ");
        int dogs = scanner.nextInt();
        System.out.print("Enter number of other animals: ");
        int otherAnimals = scanner.nextInt();
        double totalCost = dogs * 2.50 + otherAnimals * 4.00;
        System.out.printf("Total cost: %.2f lv\n", totalCost);
    }
}
