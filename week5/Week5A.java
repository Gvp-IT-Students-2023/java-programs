import java.util.Scanner;

class MyStrUtil {

  int length, perPart, numParts;
  String value;

  MyStrUtil(String value, int sizePP) {
    this.value = value;
    this.length = value.length();
    this.numParts = this.length / sizePP;
    this.perPart = this.length / this.numParts;
  }

  String[] getSubStrings() {
    String[] subs = new String[numParts + 1];
    int k = 0;
    for (int i = 0; i <= numParts; i++) {
      int start = i * perPart;
      if (start >= length) break;
      int end = (i + 1) * perPart;
      if (end >= length) end = length;
      String curr = value.substring(start, end);
      subs[k++] = curr;
    }
    return subs;
  }

  String[] sortLexically(String[] subs) {
    for (int i = 0; i < subs.length; i++) {
      for (int j = i; j < subs.length; j++) {
        if (subs[i].compareToIgnoreCase(subs[j]) > 0) {
          String temp = subs[i];
          subs[i] = subs[j];
          subs[j] = temp;
        }
      }
    }
    return subs;
  }

  void displaySorted() {
    System.out.println("Substring in lexical order: ");
    String[] subs = sortLexically(getSubStrings());
    for (int i = 0; i < subs.length; i++) {
      if (subs[i] != null && subs[i].trim().length() != 0) {
        System.out.println(subs[i]);
      }
    }
  }
}

class Week5A {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String input = sc.next();
    int n = sc.nextInt();

    MyStrUtil mStr = new MyStrUtil(input, n);
    mStr.displaySorted();
  }
}
