import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayElements = scanner.nextLine().split(" ");
        int[] arr = new int[arrayElements.length];
        for (int i = 0; i < arrayElements.length; i++) {
            arr[i] = Integer.parseInt(arrayElements[i]);
        }

        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
