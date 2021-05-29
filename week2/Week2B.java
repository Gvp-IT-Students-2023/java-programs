import java.util.Scanner;

class Week2B {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    boolean found = false;
    for (int i = 0; i < n; i++) {
      int curr = arr[i];
      if (isOdd(curr) && isPrime(curr)) {
        System.out.println("Found :" + curr);
        if (!found) found = true;
      }
    }

    if (!found) {
      System.out.println("Not Found");
    }
  }

  static boolean isOdd(int a) {
    return a % 2 == 1;
  }

  static boolean isPrime(int num) {
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) return false;
    }

    return true;
  }
}
