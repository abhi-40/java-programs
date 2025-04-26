
package synchronization_multithreading;
class my
{
   synchronized public void display(String str)// even we can declare method synchronized 
    {
        //synchronized(this)// we can use syncronized() method by passing obj like str or just use this
        //{
            for(int i=0;i<str.length();i++)
            {
                System.out.print(str.charAt(i));
            }
        //}
    }
}
class Thread1 extends Thread
{
    my m;
    public Thread1(my m)
    {
        this.m=m;
    }
    @Override
    public void run()
    {
        m.display("Hello world");
    }
}
class Thread2 extends Thread
{
    my ma;
    public Thread2(my ma)
    {
        this.ma=ma;
    }
    @Override
    public void run()
    {
        ma.display("Welcome");
    }
}
 public class Synchronization_MultiThreading {
    public static void main(String[] args)
   {
       my m=new my();
       Thread1 t1=new Thread1(m);
       t1.start();
       
       Thread2 t2=new Thread2(m);
       t2.start();
   }
}
