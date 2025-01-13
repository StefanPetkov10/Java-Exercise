package task1;

public abstract class Course {
     String name;
     Student[] students;

    public Course(String name) {
        this.name = name;
        this.students = new Student[5];
    }

    public abstract void enrollStudent();

    public abstract double calculateAverageGrade();
}
