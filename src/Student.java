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
    return String.format("\nid: %s\nname: %s\nage: %s\ngrade: %s\n", this.id, this.name, this.age, this.grade);
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
