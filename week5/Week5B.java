import java.util.Scanner;

class Week5B {

  static String vowels = "AEIOUaeiou";

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] strings = new String[n];

    for (int i = 0; i < n; i++) {
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
    int vowelsCount = 0, consonantsCount = 0;
    for (int i = 0; i < s.length(); i++) {
      char t = s.charAt(i);
      if (Character.isLetter(t)) {
        if (vowels.indexOf(t) != -1) {
          vowelsCount++;
        } else {
          consonantsCount++;
        }
      }
    }
    return new int[] { vowelsCount, consonantsCount };
  }
}
