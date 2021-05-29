class Week1A3 {

  public static void main(String args[]) {
    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < n; i++) {
      System.out.print(fib(i) + " ");
    }
  }

  public static int fib(int a) {
    if (a == 0 || a == 1) return a;
    return fib(a - 2) + fib(a - 1);
  }
}
