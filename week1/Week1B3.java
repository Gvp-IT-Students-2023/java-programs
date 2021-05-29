import java.util.Scanner;

class Week1B3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print(fib(i) + "  ");
    }
  }

  public static int fib(int a) {
    if (a == 0 || a == 1) return a;
    return fib(a - 2) + fib(a - 1);
  }
}
