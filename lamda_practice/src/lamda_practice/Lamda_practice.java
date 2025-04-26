
package lamda_practice;
@FunctionalInterface
interface lamda
{
    public void display();
}
class useLamda
{
    public void call(lamda m)
    {
        m.display();
    }
}
class demo 
{
    public void meth1()
    {
    int count=0;
    useLamda l=new useLamda();
    l.call(()->{System.out.print("hello");});
    }
   
}
public class Lamda_practice 
{
    public static void main(String[] args)
    {
      demo d=new demo();
      d.meth1();
    }
    
}
