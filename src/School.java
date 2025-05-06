import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import student.Grade;
import student.Student;

public class School {
  private String name;
  private List<Student> students = new ArrayList<>();
  private List<Course> courses = new ArrayList<>();

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public void removeCourse(Course course) {
    courses.remove(course);
  }

  public void addStudent(String name, int age, HashMap<String, Grade> grades) {
    Student student = new Student(name, age, grades);
    students.add(student);
  }

  public void addStudent(String name, int age) {
    Student student = new Student(name, age);
    students.add(student);
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }

  public School(String name) {
    this.name = name;
  }
}
