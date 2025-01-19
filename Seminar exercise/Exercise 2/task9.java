import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayElements = scanner.nextLine().split(" ");
        int[] array = new int[arrayElements.length];
        for (int i = 0; i < arrayElements.length; i++) {
            array[i] = Integer.parseInt(arrayElements[i]);
        }

        int[] reversedArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArr[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.printf(reversedArr[i] + " ");
        }
    }
}
