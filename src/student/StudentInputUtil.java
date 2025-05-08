package student;

import java.util.HashMap;
import java.util.Scanner;

public class StudentInputUtil {
  public static HashMap<String, Grade> inputGrades(Scanner scanner) {
      HashMap<String, Grade> grades = new HashMap<>();
      System.out.print("Enter number of subjects: ");
      int subjects = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < subjects; i++) {
          System.out.print("Enter course name: ");
          String course = scanner.nextLine();
          System.out.print("Enter grade (e.g., A, B_PLUS): ");
          String gradeInput = scanner.nextLine().toUpperCase();
          Grade grade = Grade.valueOf(gradeInput);
          grades.put(course, grade);
      }

      return grades;
  }

  public static int acceptValidAge(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Enter a valid age: ");
      scanner.next();
    }

    int age = scanner.nextInt();
    while (age <= 0) {
      System.out.print("Age should not be less than 1: ");
      age = scanner.nextInt();
    }
    return age;
  }

  public static int acceptValidMenuChoice(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Enter a valid menu choice: ");
      scanner.next();
    }

    return scanner.nextInt();
  }
}
