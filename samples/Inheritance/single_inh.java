class parent{
    public parent()
    {
        System.out.println("This is Base class.");
    }
}
class child extends parent /*here we are inheriting parent class using extend*/
{
    public child()
    {
        System.out.println("This is Derived class.");
    }
}
class single_inh{
    public static void main(String args[])
    {
        child c=new child();
    }
}