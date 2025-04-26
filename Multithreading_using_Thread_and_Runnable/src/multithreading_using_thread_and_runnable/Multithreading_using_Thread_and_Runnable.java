package multithreading_using_thread_and_runnable;
class myThread extends Thread // using thread class & separate class 
{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+ "hello");
            i++;
        }
    }
}
class my implements Runnable // using runnable interface & separate class 
{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+ "hello");
            i++;
        }
    }
}

public class Multithreading_using_Thread_and_Runnable 
{
    public static void main(String[] args) 
    {
      /*  myThread m=new myThread();
        m.start();
        int i=1;
        while(true)
        {   
            System.out.println(i+ "world");
            i++;
        } */
        my t=new my();
        Thread g=new Thread(t);// using thread class and attaching my obj
        g.start();// to start run method 
        while(true)
        {   
            int i=1;
            System.out.println(i+ "world");
            i++;
        }
    }
}
