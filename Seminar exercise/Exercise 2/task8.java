import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task8 {
    //Напишете програма, която отпечатва общи елементи в два масива.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        Set<String> set1 = findCommonElements(arr1, arr2);

        for (String element : set1) {
            System.out.println(element);
        }
    }

    public static Set<String> findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> common = new HashSet<>();

        for (String element : array1) {
            set1.add(element);
        }

        for (String element : array2) {
            if (set1.contains(element)) {
                common.add(element);
            }
        }
        return common;
    }
}
