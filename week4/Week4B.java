import java.util.Scanner;

class Calculator {

  static int objC = 0;

  Calculator() {
    objC++;
  }

  static int powerInt(int num1, int num2) {
    return (int) Math.pow(num1, num2);
  }

  static double powerDouble(double num1, double num2) {
    return Math.pow(num1, num2);
  }
}

class Week4B {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter base integer: ");
    int n1 = sc.nextInt();
    System.out.print("Enter exponent integer: ");
    int p1 = sc.nextInt();

    int pw1 = Calculator.powerInt(n1, p1);
    System.out.println(n1 + " power " + p1 + " is " + pw1);

    System.out.print("Enter base double: ");
    double n2 = sc.nextDouble();
    System.out.print("Enter exponent double: ");
    double p2 = sc.nextDouble();

    double pw2 = Calculator.powerDouble(n2, p2);
    System.out.println(n2 + " power " + p2 + " is " + pw2);

    System.out.println("Objects created : " + Calculator.objC);
  }
}
