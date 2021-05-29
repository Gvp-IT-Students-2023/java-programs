import java.util.Scanner;

class Week2A {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value: ");
    long a = sc.nextLong();
    if (a > Byte.MIN_VALUE && a < Byte.MAX_VALUE) {
      byte p = (byte) a;
      System.out.println("It belongs to byte range and value:" + p);
    } else if (a > Short.MIN_VALUE && a < Short.MAX_VALUE) {
      short q = (short) a;
      System.out.println("It belongs to short range and value:" + q);
    } else if (a > Integer.MIN_VALUE && a < Integer.MAX_VALUE) {
      int r = (int) a;
      System.out.println("It belongs to int range and value:" + r);
    } else if (a > Long.MIN_VALUE && a < Long.MAX_VALUE) {
      long s = a;
      System.out.println("It belongs to long range and value:" + s);
    }
  }
}
