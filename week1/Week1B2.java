import java.util.Scanner;

class Week1B2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hh = sc.nextInt();
    int mm = sc.nextInt();
    int ss = sc.nextInt();
    String a = sc.next();
    if (hh == 12 && a.equalsIgnoreCase("AM")) {
      hh = 0;
    } else if ((a.equalsIgnoreCase("PM")) && hh != 12) {
      hh += 12;
    }
    System.out.println(hh + " : " + mm + " : " + ss);
  }
}
