import java.util.Scanner;

class Week3C {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    System.out.println("Enter size of matrix:");
    n = sc.nextInt();
    int arr[][] = new int[n][n];
    int x = 0, y = 0;
    System.out.println("Enter elements into the matrix:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          x = x + arr[i][j];
          y = y + arr[i][n - 1 - i];
        }
      }
    }
    System.out.println(
      "Absolute difference of diagonal elements is:" + Math.abs(x - y)
    );
  }
}
