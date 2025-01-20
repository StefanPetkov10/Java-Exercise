import java.util.Scanner;

public class task14 {
    //k = 2
    //на {1, 2, 3, 4, 5}, резултатът е {4, 5, 1, 2, 3}.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayElements = scanner.nextLine().split(" ");
        int[] arr = new int[arrayElements.length];
        for (int i = 0; i < arrayElements.length; i++) {
            arr[i] = Integer.parseInt(arrayElements[i]);
        }

        int k = scanner.nextInt();
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[(i + k) % arr.length] = arr[i];
        }
        for (int i : rotatedArr) {
            System.out.printf(i + " ");
        }
    }
}
