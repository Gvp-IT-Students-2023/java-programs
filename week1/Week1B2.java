import java.util.Scanner;
class Week1B2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h,m,s;
    String t;
    h=sc.nextInt();
    m=sc.nextInt();
    s=sc.nextInt();
    t=sc.next();
    if(h==12&&t.equalsIgnoreCase("AM"))
         {
             h=0;
         }
         else if((t.equalsIgnoreCase("PM"))&&h!=12)
         {
             h=h+12;
         }
         System.out.println(h+" : "+m+" : "+s);
  }
}
