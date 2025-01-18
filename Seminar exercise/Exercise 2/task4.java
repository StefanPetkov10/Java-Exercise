import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
