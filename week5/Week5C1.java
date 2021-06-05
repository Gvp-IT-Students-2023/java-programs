import java.util.Scanner;

class Week5C1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 2 strings: ");

    String s1 = sc.next();
    String s2 = sc.next();

    if (checkAnagram(s1, s2)) {
      System.out.print("Yes they are anagrams");
    } else {
      System.out.print("No they are not anagrams");
    }
  }

  static boolean checkAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    boolean isAnagram = true;
    char[] c1 = sort(s1.toCharArray());
    char[] c2 = sort(s2.toCharArray());

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) {
        isAnagram = false;
        break;
      }
    }

    return isAnagram;
  }

  static char[] sort(char[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          char t = arr[j];
          arr[j] = arr[i];
          arr[i] = t;
        }
      }
    }
    return arr;
  }
}
