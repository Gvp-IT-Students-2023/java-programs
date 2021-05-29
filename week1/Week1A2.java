class Week1A2 {

  public static void main(String[] args) {
    int hh = Integer.parseInt(args[0]);
    int mm = Integer.parseInt(args[1]);
    int ss = Integer.parseInt(args[2]);
    String a = args[3];
    if (hh == 12 && a.equalsIgnoreCase("AM")) {
      hh = 0;
    } else if ((a.equalsIgnoreCase("PM")) && hh != 12) {
      hh += 12;
    }

    System.out.println(hh + ":" + mm + ":" + ss);
  }
}
