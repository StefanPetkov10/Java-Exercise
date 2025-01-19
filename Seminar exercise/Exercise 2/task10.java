import java.util.Scanner;

public class task10 {
    //Напишете програма, която премахва всички срещания на дадено число от масив и връща нов масив
    //без него.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayElements = scanner.nextLine().split(" ");
        int[] array = new int[arrayElements.length];
        for (int i = 0; i < arrayElements.length; i++) {
            array[i] = Integer.parseInt(arrayElements[i]);
        }

        System.out.println("Enter a number to remove:");
        int numberToRemove = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToRemove) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberToRemove) {
                newArray[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.printf(newArray[i] + " ");
        }
    }
}
