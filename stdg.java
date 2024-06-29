public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();

        Student student = new Student(name, grade);

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        scanner.close();
    }
}


mkdir GradeFormJava
cd GradeFormJava
code .


javac *.java
java Main


mkdir GradeFormHTML
cd GradeFormHTML
code .


