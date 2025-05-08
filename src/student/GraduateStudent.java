package student;

public class GraduateStudent extends Student {
  private String thesisTitle, advisorName;

  public GraduateStudent(String name, int age, String thesisTitle, String advisorName) {
    super(name, age);
    this.thesisTitle = thesisTitle;
    this.advisorName = advisorName;
  }

  public String getThesisTitle() {
    return thesisTitle;
  }

  public void setThesisTitle(String thesisTitle) {
    this.thesisTitle = thesisTitle;
  }

  public String getAdvisorName() {
    return advisorName;
  }

  public void setAdvisorName(String advisorName) {
    this.advisorName = advisorName;
  }

  @Override
  public String displayInfo() {
    return super.displayInfo() +
        "Thesis Title: " + thesisTitle + "\n" +
        "Advisor Name: " + advisorName + "\n";
  }

  @Override
  public String report() {
    return super.report() +
        "Thesis Title: " + thesisTitle + "\n" +
        "Advisor: " + advisorName + "\n";
  }
}
