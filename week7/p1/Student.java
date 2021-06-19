package p1;

public class Student {

  public String name;
  public int roll_number;

  public Student(String name, int roll_number) {
    this.name = name;
    this.roll_number = roll_number;
  }

  @Override
  public String toString() {
    return ("Name: " + name + ", roll no : " + roll_number);
  }
}
