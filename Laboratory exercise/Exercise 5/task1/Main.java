package task1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Course[] courses = new Course[]{
                new Math("Mathematics"),
                new ComputerScience("Computer Science")
        };

        for (Course course : courses) {
            course.enrollStudent();
        }

        String studentsFilePath = "students_data.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentsFilePath))) {
            for (Course course : courses) {
                writer.write("task1.Course: " + course.name);
                writer.newLine();
                for (Student student : course.students) {
                    writer.write("task1.Student Name: " + student.name + ", Grades: " + Arrays.toString(student.grades));
                    writer.newLine();
                }
            }

        }


        String averageGradesFilePath = "average_grades.txt";
        try (BufferedWriter avgWriter = new BufferedWriter(new FileWriter(averageGradesFilePath))) {
            for (Course course : courses) {
                double averageGrade = course.calculateAverageGrade();
                avgWriter.write("task1.Course: " + course.name + ", Average Grade: " + averageGrade);
                avgWriter.newLine();
            }
            System.out.println("Average grades saved to: " + averageGradesFilePath);
        }
        catch (IOException e) {
            System.err.println("Error writing to average.txt" + e.getMessage());
        }
    }
}
