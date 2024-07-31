
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println(
                "This program will calculate your total marks, average percentage, and grade based on your input.");
        char grade;
        int totalMarks = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects you have ");
        int totalSubject = scanner.nextInt();
        if (totalSubject <= 0) {
            System.out.println("Number of subjects must be greater than zero.");
            scanner.close();
            return;
        }
        for (int i = 1; i <= totalSubject; i++) {
            System.out.print("Enter your marks out of 100 in subject " + i + " :");
            int value = scanner.nextInt();
            if (value < 0 || value > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                i--;
                continue;
            }

            totalMarks += value;
        }
        int avgMarks = totalMarks / totalSubject;
        if (avgMarks >= 0 && avgMarks <= 30) {
            grade = 'F';
        } else if (avgMarks > 30 && avgMarks <= 50) {
            grade = 'D';
        } else if (avgMarks > 50 && avgMarks <= 70) {
            grade = 'C';
        } else if (avgMarks > 70 && avgMarks <= 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("\n--- Results ---");
        System.out.println("Total Subjects: " + totalSubject);
        System.out.println("Total Marks: " + totalMarks + " out of " + (totalSubject * 100));
        System.out.println("Percentage: " + avgMarks + "%");
        System.out.println("Grade: " + grade);
        System.out.println("----------------");
        scanner.close();
    }
}