import java.util.Scanner;

class Week5B {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no. of strings: ");
    int n = sc.nextInt();

    String[] strings = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter string " + (i + 1) + " : ");
      strings[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      int[] res = getVowelsConsonantsCount(strings[i]);
      System.out.print(strings[i] + ":");
      System.out.print(" vowels - " + res[0]);
      System.out.println(" consonants - " + res[1]);
    }
  }

  static int[] getVowelsConsonantsCount(String s) {
    int vc = 0, cc = 0;
    String vowels = "AEIOUaeiou";
    for (int i = 0; i < s.length(); i++) {
      char t = s.charAt(i);
      if ('A' <= t && t <= 'z') {
        if (vowels.indexOf(t) != -1) vc++; else cc++;
      }
    }
    return new int[] { vc, cc };
  }
}
