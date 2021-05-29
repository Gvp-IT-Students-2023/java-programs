import java.util.Scanner;

class Week3A {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter size of the square matrix:");
    n = sc.nextInt();
    int a = n * n;
    int arr[] = new int[a];
    System.out.println("Enter contents of the matrix:");
    for (int i = 0; i < a; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < a; i++) {
      if (i % (n + 1) == 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
