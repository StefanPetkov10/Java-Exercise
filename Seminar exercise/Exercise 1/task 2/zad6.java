package task2;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the architect's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of projects: ");
        int projects = scanner.nextInt();
        int hours = projects * 3;
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + projects + " project/s.");
    }
}
