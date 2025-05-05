public class Student {
  private String name;
  private int age;
  private int id;
  private char grade;
  private static int nextId;

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

  @Override
  public String toString() {
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

    return results.toString();
  }

  public Student(String name, int age, char grade) {
    this.age = age;
    this.name = name;
    this.grade = grade;
    this.id = nextId++;
  }

  public Student(String name, int age) {
    this.age = age;
    this.name = name;
    this.id = nextId++;
  }
}
