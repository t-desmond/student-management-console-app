package student;

public enum Grade {
  A("A"),
  A_MINUS("A-"),
  A_PLUS("A+"),
  B("B"),
  B_MINUS("B-"),
  B_PLUS("B+"),
  C("C"),
  C_MINUS("C-"),
  C_PLUS("C+"),
  D("D"),
  D_MINUS("D-"),
  D_PLUS("D+"),
  E("E"),
  E_MINUS("E-"),
  E_PLUS("E+"),
  F("F"),
  F_MINUS("F-"),
  F_PLUS("F+"),;

  private final String display;

  Grade(String display) {
    this.display = display;
  }

  @Override
  public String toString() {
    return display;
  }
}