package task1;

import java.util.Scanner;

public class Math extends Course {

    public Math(String name) {
        super(name);
    }

    @Override
    public void enrollStudent() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter information for task1.Student " + (i + 1) + " in the " + name + " course:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grades (three numbers separated by spaces): ");
            String[] gradesInput = scanner.nextLine().split(" ");
            double[] grades = new double[gradesInput.length];
            for (int j = 0; j < gradesInput.length; j++) {
                grades[j] = Double.parseDouble(gradesInput[j]);
            }
            students[i] = new Student(name, grades);
        }
    }

    @Override
    public double calculateAverageGrade() {
        double sum = 0;
        for (Student student : students) {
            sum += student.calculateAverageGrade();
        }
        return sum / students.length;
    }
}
