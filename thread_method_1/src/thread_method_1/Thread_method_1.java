
package thread_method_1;
class myThread extends Thread
{
   public myThread(String name)
   {
       super(name);
       
   }
   @Override
    public void run()
   {
       int count =1;
       while(true)
       {
           System.out.println(count++);
           try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
           System.out.println(e); 
        }
       }
   }
}
public class Thread_method_1
{

    public static void main(String[] args) 
    {
        myThread m=new myThread("Abhishek");
        m.start();
        m.interrupt();
       
        /*Thread h=new Thread("Thread 2");
         m.setDaemon(true);// dameon means BG thread with less priority
        System.out.println("Is it demon thread?: "+ m.isDaemon());
        System.out.println("Name of thread: "+h.getName());
        h.start();
        h.setPriority(Thread.MIN_PRIORITY+5);
        System.out.println("State is "+h.getState());
        System.out.println("is alive: "+h.isAlive());
        //h.setPriority(9);
        System.out.println("thread id:"+h.threadId());
        System.out.println("Priority:"+h.getPriority());*/
    }
    
}
