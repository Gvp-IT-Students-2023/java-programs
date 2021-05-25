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
class child_2 extends parent /*derived from parent class */
{
    public child_2()//constructor
    {
        System.out.println("This is Derived class derived from Parent class.");
    }
}
class hierarchical_inh{
    public static void main(String args[])
    {
        child d=new child();//creating object for child class
       child_2 c=new child_2();//creating object for  child_2 class
    }
}