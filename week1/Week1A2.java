class Week1A2 {

  public static void main(String[] args) {
    int h,m,s;
         String t;
         h=Integer.parseInt(args[0]);
         m=Integer.parseInt(args[1]);
         s=Integer.parseInt(args[2]);
         t=args[3];
         if(h==12&&t.equalsIgnoreCase("AM"))
         {
             h=0;
         }
         else if((t.equalsIgnoreCase("PM"))&&h!=12)
         {
             h=h+12;
         }
         System.out.println(h+":"+m+":"+s);
  }
}
