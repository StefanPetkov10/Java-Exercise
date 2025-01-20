import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        findUnion(arr1, arr2);
        System.out.println();
        findIntersection(arr1, arr2);
    }

    public static void findUnion(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> union = new HashSet<>();

        for (String element : array1) {
            set1.add(element);
        }

        for (String element : array2) {
            set2.add(element);
        }

        union.addAll(set1);
        union.addAll(set2);

        for (String element : union) {
            System.out.printf(element + " ");
        }
    }

    public static void findIntersection(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> intersection = new HashSet<>();

        for (String element : array1) {
            set1.add(element);
        }

        for (String element : array2) {
            set2.add(element);
        }

        for (String element : set1) {
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }

        for (String element : intersection) {
            System.out.printf(element + " ");
        }
    }
}
