package piped_stream;
import java.io.*;

class producer extends Thread 
{
    OutputStream os;
    public producer(OutputStream s)
    {
        os=s;
    }
    @Override
    public void run()
    {
        int count=1;
        while(true){
        try
        {
        os.write(count);
        os.flush();
        System.out.println("Producer: "+count);
        Thread.sleep(10);
        System.out.flush();
        count++;
        }catch (Exception e){}
        
      }
    }
}
 class consumer extends Thread
{
    InputStream is;
    public consumer(InputStream s)
    {
        is=s;
    }
    public void run()
    {
        int x;
        while(true)
        try{    
        x=is.read();
        System.out.println("consumer: "+x);
        System.out.flush();
        }catch(Exception ex){}
    }
}
public class Piped_Stream {
 public static void main(String[] args) throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        
        consumer c=new consumer(pis);
        producer p=new producer(pos);
        p.start();
        c.start();
        pis.connect(pos);
    }
    
}
