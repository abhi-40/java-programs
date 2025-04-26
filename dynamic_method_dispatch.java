class Super
{
    public void meth1()
    {
        System.out.println("super meth 1");
    }
    public void meth2()
    {
        System.out.println("super meth 2");
    }
}
class Sub
{
    public void meth2()
    {
        System.out.println("sub meth 2");
    }
    public void meth3()
    {
        System.out.println("sub meth 3");
    }
}
public class dynamic_method_dispatch 
{
    public static void main(String[] args) 
    {
       Super sup=new Sub();
       sup.meth1();
    }
}