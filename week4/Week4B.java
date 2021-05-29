import java.util.Scanner;

class Calculator {

  public static int powerInt(int num1, int num2) {
    int pow = 1;
    for (int i = 0; i < num2; i++) pow *= num1;
    return pow;
  }

  public static double powerDouble(double num1, double num2) {
    double pow = 1.0;
    for (int i = 0; i < num2; i++) pow *= num1;
    return pow;
  }
}

class Week4B {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter base integer: ");
    int n1 = sc.nextInt();
    System.out.print("Enter exponent integer: ");
    int p1 = sc.nextInt();
    System.out.println(
      n1 + " power " + p1 + " is " + Calculator.powerInt(n1, p1)
    );

    System.out.print("Enter base double: ");
    double n2 = sc.nextDouble();
    System.out.print("Enter exponent double: ");
    double p2 = sc.nextDouble();
    System.out.println(
      n2 + " power " + p2 + " is " + Calculator.powerDouble(n2, p2)
    );
  }
}
