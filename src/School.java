import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import student.Grade;
import student.Student;

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
    courses.remove(course);
  }

  public static void addStudent(String name, int age, HashMap<String, Grade> grades) {
    Student student = new Student(name, age, grades);
    students.add(student);
  }

  public static void addStudent(String name, int age) {
    Student student = new Student(name, age);
    students.add(student);
  }

  public static void removeStudent(Student student) {
    students.remove(student);
  }
}
