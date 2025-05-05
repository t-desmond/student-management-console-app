public class Course {
  private String name;
  private String code;
  private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    StringBuilder course = new StringBuilder();

    course.append("ID: ").append(name).append("\n");
    course.append("Grades: ").append(code);
    course.append("Age: ").append(description).append("\n");

    return course.toString();
  }

  public Course(String name, String code, String description) {
    this.name = name;
    this.code = code;
    this.description = description;
  }
}
