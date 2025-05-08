package student;

public enum Grade {
  A("A", 4.0),
  A_MINUS("A-", 3.7),
  B_PLUS("B+", 3.3),
  B("B", 3.0),
  B_MINUS("B-", 2.7),
  C_PLUS("C+", 2.3),
  C("C", 2.0),
  C_MINUS("C-", 1.7),
  D("D", 1.0),
  F("F", 0.0);

  private final String display;
  private final double points;

  Grade(String display, double points) {
      this.display = display;
      this.points = points;
  }

  public double toPoints() {
      return points;
  }

  @Override
  public String toString() {
      return display;
  }
}
