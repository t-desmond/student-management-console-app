import java.util.Scanner;
import java.util.UUID;
import java.util.HashMap;
import student.Student;
import student.Grade;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the school name: ");
        String schoolName = scanner.nextLine();

        School school = new School(schoolName);
        boolean running = true;

        System.out.println("\nWelcome to " + schoolName.toUpperCase() + " School Console App\n");


        while (running) {
            System.out.println(mainMenu());
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> handleCourses(scanner, school);
                case 2 -> handleStudents(scanner, school);
                case 0 -> {
                    System.out.println("Exiting...");
                    running = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    public static String courseMenu() {
        StringBuilder courseMenu = new StringBuilder();
        courseMenu.append("1. Add course\n");
        courseMenu.append("2. Display all courses\n");
        courseMenu.append("3. Remove course\n");
        courseMenu.append("4. Main menu\n");

        return courseMenu.toString();
    }

    public static String studentMenu() {
        StringBuilder studentMenu = new StringBuilder();
        studentMenu.append("1. Add student\n");
        studentMenu.append("2. Display all students\n");
        studentMenu.append("3. Remove student\n");
        studentMenu.append("4. Main menu\n");

        return studentMenu.toString();
    }

    public static String mainMenu() {
        StringBuilder courseMenu = new StringBuilder();
        courseMenu.append("1. Manage courses\n");
        courseMenu.append("2. Manage students\n");
        courseMenu.append("0. Exit\n");

        return courseMenu.toString();
    }

    public static void handleStudents(Scanner scanner, School school) {
        boolean inStudentMenu = true;

        while (inStudentMenu) {
            System.out.println(studentMenu());
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

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

                    school.addStudent(name, age, grades);
                    System.out.println("Student added.");
                }
                case 2 -> {
                    System.out.println("STUDENT LIST:");
                    for (Student s : school.getStudents()) {
                        System.out.println(s);
                    }
                }
                case 3 -> {
                    System.out.print("Enter student ID to remove: ");
                    String idinput = scanner.nextLine().trim();
                    if (idinput.isEmpty()) {
                        System.out.println("ID must not be empty");
                        continue;
                    }
                    
                    try {
                        UUID id = UUID.fromString(idinput);
                        Student toRemove = school.getStudents().stream()
                        .filter(s -> s.getId().equals(id))
                        .findFirst().orElse(null);
                    if (toRemove != null) {
                        school.removeStudent(toRemove);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid UUID format");
                    }
                }
                case 4 -> inStudentMenu = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void handleCourses(Scanner scanner, School school) {
        boolean inCourseMenu = true;

        while (inCourseMenu) {
            System.out.println(courseMenu());
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter course name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();

                    Course course = new Course(name, description);
                    school.addCourse(course);
                    System.out.println("Course added.");
                }
                case 2 -> {
                    System.out.println("COURSE LIST:");
                    for (Course c : school.getCourses()) {
                        System.out.println(c);
                    }
                }
                case 3 -> {
                    System.out.print("Enter course code to remove: ");
                    String code = scanner.nextLine();
                    Course toRemove = school.getCourses().stream()
                        .filter(c -> c.getCode().equalsIgnoreCase(code))
                        .findFirst().orElse(null);
                    if (toRemove != null) {
                        school.removeCourse(toRemove);
                        System.out.println("Course removed.");
                    } else {
                        System.out.println("Course not found.");
                    }
                }
                case 4 -> inCourseMenu = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
