package task2;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }
}
