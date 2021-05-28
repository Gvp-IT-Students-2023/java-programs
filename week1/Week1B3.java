import java.util.Scanner;
class Week1B3 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i=0;
         int n=sc.nextInt();
         for(i=0;i<n;i++)
         {
         System.out.print(fib1(i)+"  ");
         }
  }
  public  static int  fib1(int a)
     {
         if (a==0||a==1)
         {
             return a;
         }
         else return fib1(a-2)+fib1(a-1);
     }
}
