import java.util.Scanner;

public class task3 {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(getMax(arr));
    }
}
