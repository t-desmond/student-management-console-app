public class App {
    public static void main(String[] args) throws Exception {
        Course english = new Course("english", "00C1", "english language");
        Course computerScience = new Course("computer science", "00C2", "computer science");

        Student jammy = new Student("jammy", 15);
        Student james = new Student("james", 20);

        School.addCourse(english);
        School.addCourse(computerScience);

        School.addStudent(james);
        School.addStudent(jammy);

        System.out.println(School.getCourses().toString());
        System.out.println(School.getStudents());
        System.out.println(james.report());
    }
}
