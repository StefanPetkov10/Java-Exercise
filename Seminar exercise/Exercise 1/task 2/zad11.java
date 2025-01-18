package task2;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of campaign days: ");
        int days = scanner.nextInt();
        System.out.print("Enter number of bakers: ");
        int bakers = scanner.nextInt();
        System.out.print("Enter number of cakes: ");
        int cakes = scanner.nextInt();
        System.out.print("Enter number of waffles: ");
        int waffles = scanner.nextInt();
        System.out.print("Enter number of pancakes: ");
        int pancakes = scanner.nextInt();
        double totalMoney = bakers * days * (cakes * 45 + waffles * 5.8 + pancakes * 3.2);
        double netMoney = totalMoney - totalMoney / 8;
        System.out.printf("Total money raised: %.2f lv\n", netMoney);
    }
}
