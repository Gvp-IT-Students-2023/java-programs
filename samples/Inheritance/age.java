//This program explains the use of super keyword
class grand_father
{
    int g_age;
    public grand_father(int a)
    {
        g_age=a;
    }
}
class father extends grand_father{
    int f_age;
 public father(int x,int y)
 {
    super(x);
    f_age=y;
 }
}
class grand_child extends father
{
    int gc_age;
    public grand_child(int a,int b,int c)
 {
     super(a,b);
     gc_age=c;
 }
 void display()
 {
     System.out.println("Age difference between son and grand father is:"+(g_age-gc_age));
     System.out.println("Age difference between son and  father is:"+(f_age-gc_age));
     System.out.println("Age difference between father and grand father is:"+(g_age-f_age));
 }
}
public class age{
    public static void main(String args[])
    {
        grand_child obj=new grand_child(60,40,15);
        obj.display();
    }
}