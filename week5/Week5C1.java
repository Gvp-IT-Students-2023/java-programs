import java.util.Scanner;

class Week5C1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    char[] c1 = sort(s1.toCharArray());
    char[] c2 = sort(s2.toCharArray());

    boolean anagram = true;
    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) anagram = false;
    }

    System.out.print(s1 + " and " + s2 + " are");
    String res = (anagram ? " anagrams" : " not anagrams");
    System.out.print(res);
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
