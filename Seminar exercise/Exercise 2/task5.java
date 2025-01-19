import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    //Напишете програма, която да сортира низове по дължина с помощта на метод от класа Arrays
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = scanner.nextInt();
        String[] arr = new String[arrLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a string:");
            arr[i] = scanner.next();
        }

        java.util.Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
