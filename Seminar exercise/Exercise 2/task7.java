import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
        }

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
