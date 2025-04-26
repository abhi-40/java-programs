class parent
{
    parent()
    {
        System.out.println("parent non para const");
    }
    parent(int x)
    {
        System.out.println("parent para const"+x);
    }
}
class child extends parent
{
    child()
    {
        System.out.println("child non para const");
    }
    child(int x,int y)
    {
        super(x);
        System.out.println("child para const"+y);
    }
}
public class super_inheritance 
{
    public static void main(String[] args) 
    {
        
        child obj=new child(20,30);
    }
}
