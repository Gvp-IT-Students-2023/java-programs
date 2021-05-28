class room
{
    int length,breadth,height;
    void volume()
    {
        System.out.println("Volume of room is:"+length*breadth*height);
    }
}
class livingroom extends room{
    public livingroom(int a,int b, int c)
    {
        length=a;
        breadth=b;
        height=c;
    }
    void volume()
    {
        System.out.println("Volume of living room is:"+length*breadth*height);
    }
}
class diningroom extends room{
    public diningroom(int a,int b, int c)
    {
        length=a;
        breadth=b;
        height=c;
    }
    void volume()
    {
        System.out.println("Volume of dining room is:"+length*breadth*height);
    }
}
class display
{
    void display_vol(room obj)
    {
        obj.volume();
    }
}
class home
{
    public static void main(String args[])
    {
        display ob=new display();
        room obj1=new livingroom(10,20,30);
        room obj2=new diningroom(20,30,40);
        ob.display_vol(obj1);
        ob.display_vol(obj2);
    }
}