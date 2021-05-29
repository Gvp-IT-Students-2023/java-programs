import java.util.Scanner;

class Week3B {

  public static void main(String args[]) {
    int products = 0, years = 0, i = 0, j = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of years:");
    years = sc.nextInt();
    System.out.println("Enter number of products:");
    products = sc.nextInt();
    int arr[][] = new int[years][products];
    int yrs[] = new int[years];
    int prd[] = new int[products];
    System.out.println("Enter financial years:");
    for (i = 0; i < years; i++) {
      yrs[i] = sc.nextInt();
    }
    System.out.println("Enter product ids:");
    for (i = 0; i < products; i++) {
      prd[i] = sc.nextInt();
    }
    System.out.println("Enter details:");
    for (i = 0; i < years; i++) {
      for (j = 0; j < products; j++) {
        System.out.println(
          "Enter sales during year " +
          yrs[i] +
          " for the product  " +
          prd[j] +
          ":"
        );
        arr[i][j] = sc.nextInt();
      }
    }
    high(arr, years, products, yrs, prd);
  }

  public static void high(int a[][], int x, int y, int r[], int j[]) {
    int z = 0, p = 0, k = 0;
    for (int i = 0; i < x; i++) {
      for (int m = 0; m < y; m++) {
        if (a[i][m] > p) {
          p = a[i][m];
          z = m;
          k = i;
        }
      }
    }
    System.out.println(
      "Highest demand is recorded for " +
      j[z] +
      " in the year " +
      r[k] +
      "and demand is " +
      p
    );
  }
}
