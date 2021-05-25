class parent{
    public parent()//constructor
    {
        System.out.println("This is Base class.");
    }
}
class child extends parent /*derived from parent class*/
{
    public child()//constructor
    {
        System.out.println("This is Derived class.");
    }
}
class grandchild extends child /*derived from another derived class */
{
    public grandchild()//constructor
    {
        System.out.println("This is Derived class derived from another derived class.");
    }
}
class multilevel_inh{
    public static void main(String args[])
    {
        grandchild c=new grandchild();//creating object for grand child class
    }
}