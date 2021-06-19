import java.util.*;
import java.util.HashSet;

public class Week8A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter range from : ");
    int min = sc.nextInt();
    System.out.print("Enter range to : ");
    int max = sc.nextInt();
    System.out.print("Enter how many values : ");
    int n = sc.nextInt();

    if (n > max) {
      System.out.println(
        "Cannot print " + n + " unique random numbers in range 1 to " + max
      );
      return;
    }

    Random random = new Random();
    Set<Integer> numbersSet = new HashSet<Integer>();
    // LinkedHashSet for preserving inserting order

    while (numbersSet.size() < n) {
      int ran = random.nextInt(max + 1);
      if (ran != 0 && ran >= min) numbersSet.add(ran);
    }

    System.out.print(
      n + " unique random numbers in range " + min + " to " + max + " : "
    );
    System.out.println(numbersSet);
  }
}
