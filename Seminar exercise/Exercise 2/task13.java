import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayElements = scanner.nextLine().split(" ");
        int[] arr = new int[arrayElements.length];
        for (int i = 0; i < arrayElements.length; i++) {
            arr[i] = Integer.parseInt(arrayElements[i]);
        }
        //{1 2 3 4 5 4 3 2 1}
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
