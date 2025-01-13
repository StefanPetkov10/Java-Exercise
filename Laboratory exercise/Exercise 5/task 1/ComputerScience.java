package task1;

import java.util.Scanner;

public class ComputerScience extends Course {

    public ComputerScience(String name) {
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
                try {
                    grades[j] = Double.parseDouble(gradesInput[j]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for grades. Please enter valid numbers.");
                    j--;  // Повтаря въвеждането за тази оценка
                }
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
