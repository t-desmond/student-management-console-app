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
}
