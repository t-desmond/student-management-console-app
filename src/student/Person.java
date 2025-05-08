package student;
import java.util.UUID;

public abstract class Person {
  protected final UUID id;
  protected String name;
  protected int age;

  public UUID getId() {
    return id;
  }
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

  public abstract String displayInfo();

  Person(String name, int age) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.age = age;
  }
}
