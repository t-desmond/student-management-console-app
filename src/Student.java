public class Student {
  private String name;
  private int age;
  private int id;
  private char grade;

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
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public char getGrade() {
    return grade;
  }
  public void setGrade(char grade) {
    this.grade = grade;
  }

  public Student(String name, int age, char grade) {
    this.age = age;
    this.name = name;
    this.grade = grade;
    this.id++;
  }

  public Student(String name, int age) {
    this.age = age;
    this.name = name;
    this.id++;
  }
}
