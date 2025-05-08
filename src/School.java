import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import student.Grade;
import student.Person;
import student.Student;

public class School {
  private String name;
  private List<Person> students = new ArrayList<>();
  private List<Course> courses = new ArrayList<>();

  public List<Person> getStudents() {
    return students;
  }

  public void setStudents(List<Person> students) {
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

  public void addStudent(Person student) {
    students.add(student);
  }

  public void removeStudent(Person student) {
    students.remove(student);
  }

  public Person findStudent(UUID id) {
    return this.students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
  }

  public School(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
