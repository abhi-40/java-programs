
package thread_method_2.java;

class my extends Thread
{
    public my(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        int count =1;
        while(true)
        {
            System.out.println(count++ +"My thread");
        }
    }
}
public class Thread_method_2Java {

    public static void main(String[] args) throws InterruptedException
    {
        my m=new my("abhishek");
        //m.setDaemon(true);
        m.start();
        //Thread mainThread=Thread.currentThread();
        //mainThread.join(); 
        int count =1;
        while(true)
        {
            System.out.println(count++ +"Main");
            Thread.yield();
        }
       
        /*try
        {
            m.sleep(1);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
         m.interrupt();*/
    }
    
}
