import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to search for:");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The number is found.");
        } else {
            System.out.println("The number is not found.");
        }
    }
}
