import java.util.Scanner;

public class task11 {
    //Напишете програма, която сортира масив от цели числа в нарастващ ред, без да използва вградени
    //методи.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayElements = scanner.nextLine().split(" ");
        int[] arr = new int[arrayElements.length];
        for (int i = 0; i < arrayElements.length; i++) {
            arr[i] = Integer.parseInt(arrayElements[i]);
        }

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
