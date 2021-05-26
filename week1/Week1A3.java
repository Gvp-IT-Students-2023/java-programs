class Week1A3 {

  public static void main(String args[])
     {
         int i=0;
         int n=Integer.parseInt(args[0]);
         for(i=0;i<n;i++)
         {
         System.out.print(fib1(i)+" ");
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
