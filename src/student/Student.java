package student;
import java.util.HashMap;
import java.util.UUID;

public class Student extends Person {
  protected HashMap<String, Grade> grade;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public UUID getId() {
    return id;
  }

  public HashMap<String, Grade> getGrade() {
    return grade;
  }

  public void setGrade(String course, Grade grade) {
    this.grade.put(course, grade);
  }

  @Override
  public String toString() {
    return displayInfo();
  }

  @Override
  public String displayInfo() {
    StringBuilder student = new StringBuilder();
    student.append("ID: ").append(id).append("\n");
    student.append("Name: ").append(name).append("\n");
    student.append("Age: ").append(age).append("\n");
    student.append("Grades: ").append(grade);
    
    return student.toString();
  }

  public String report() {
    StringBuilder results = new StringBuilder();

    results.append("\n**********RESULTS**********\n");
    results.append("\nStudent name: " + this.name);
    results.append("\nId: " + this.id);
    results.append("\nAge: " + this.age);
    results.append("\nGrade(s): " + this.grade);
    results.append("\nGPA: " + this.calculateGPA() );

    return results.toString();
  }

  public Student(String name, int age, HashMap<String, Grade> grade) {
    super(name, age);
    this.grade = grade;
  }

  public Student(String name, int age) {
    super(name, age);
    this.grade = new HashMap<>();
  }

  public double calculateGPA() {
    if (grade == null || grade.isEmpty()) return 0.0;

    double total = 0;
    for (Grade g : grade.values()) {
        total += g.toPoints();
    }

    return (double) total / grade.size(); 
}

}
