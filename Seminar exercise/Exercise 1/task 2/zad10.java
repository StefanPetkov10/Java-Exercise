package task2;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total pages: ");
        int totalPages = scanner.nextInt();
        System.out.print("Enter pages per hour: ");
        double pagesPerHour = scanner.nextDouble();
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        int hoursPerDay = (int) (totalPages / pagesPerHour / days);
        System.out.println("Hours per day: " + hoursPerDay);
    }
}
