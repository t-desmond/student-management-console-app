import java.util.ArrayList;
import java.util.List;

public class School {
  private static List<Student> students = new ArrayList<>();
  private static List<Course> courses = new ArrayList<>();

  public static List<Student> getStudents() {
    return students;
  }
  public static void setStudents(List<Student> students) {
    School.students = students;
  }
  public static List<Course> getCourses() {
    return courses;
  }
  public static void setCourses(List<Course> courses) {
    School.courses = courses;
  }

  public static void addCourse(Course course) {
    courses.add(course);
  }

  public static void removeCourse(Course course) {
    int courseIndex = courses.indexOf(course);
    courses.remove(courseIndex);
  }

  public static void addStudent(Student student) {
    students.add(student);
  }

  public static void removeStudent(Student student) {
    int studentIndex = students.indexOf(student);
    students.remove(studentIndex);
  }
}
