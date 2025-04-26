abstract class Super
{
    public Super() 
    {
        System.out.println("Super const"); 
    }
    public void meth1()
    {
        System.out.println("meth1 of super");
    }
    abstract public void meth2();
}
class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("meth 2 of sub");
    }
}
public class abstract_class 
{
    public static void main(String[] args) 
    {
        Sub s=new Sub();
        s.meth1();
        s.meth2();
       
    }
}