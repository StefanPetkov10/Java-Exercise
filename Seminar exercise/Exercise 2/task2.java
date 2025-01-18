import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Average: " + sum / arr.length);
    }
}
