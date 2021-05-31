import java.util.Arrays;
import java.util.Scanner;

class Week5C2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();

    char[] chArr1 = s1.toCharArray();
    Arrays.sort(chArr1);
    String newStr1 = new String(chArr1);

    char[] chArr2 = s2.toCharArray();
    Arrays.sort(chArr2);
    String newStr2 = new String(chArr2);

    boolean anagram = newStr1.equals(newStr2);

    System.out.print(s1 + " and " + s2 + " are");
    String res = (anagram ? " anagrams" : " not anagrams");
    System.out.print(res);
  }
}
