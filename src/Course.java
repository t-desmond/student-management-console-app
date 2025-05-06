import java.util.HashMap;
import java.util.Map;

public class Course {
  private static final Map<String, Integer> departmentCounters = new HashMap<>();
    private static final int DEFAULT_SUFFIX_START = 101;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
public String toString() {
    StringBuilder course = new StringBuilder();

    course.append("Course Name: ").append(name).append("\n");
    course.append("Course Code: ").append(code).append("\n");
    course.append("Description: ").append(description).append("\n");
    
    return course.toString();
}


  public Course(String name,  String description) {
    this.name = name;
    this.description = description;
    this.code = generateCode(name);
  }

  public static String generateCode(String subject) {
    String department = extractDepartmentPrefix(subject);
    
    int suffix = departmentCounters.getOrDefault(department, DEFAULT_SUFFIX_START);
    
    String code = String.format("%s%03d", department, suffix);
    
    departmentCounters.put(department, suffix + 1);
    
    return code;
}

private static String extractDepartmentPrefix(String subject) {
    String cleaned = subject.replaceAll("[^a-zA-Z]", "").toUpperCase();
    
    if (cleaned.length() < 4) {
        return String.format("%-4s", cleaned).replace(' ', '0');
    }
    return cleaned.substring(0, 4);
}
}
