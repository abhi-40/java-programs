package multi_user_echo_reverse;
import java.net.*;
import java.io.*;
public class Multi_user_echo_reverse extends Thread 
{
        Socket stk;
        public  Multi_user_echo_reverse(Socket stk)
        {
            this.stk=stk;
            
        }

    public void run()
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps=new PrintStream(stk.getOutputStream());
        
            String msg;

        do
        {
            msg=br.readLine();
            StringBuilder sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();   
        }
          
        while(!msg.equals("dne"));
        stk.close();
}
        catch(Exception ex)
        {
            System.out.println("EXCEPTION: "+ex.getMessage());
        }
    }
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss=new ServerSocket(2000);
        Socket stk;
        int count =1;
        Multi_user_echo_reverse er;
        do
        {
            stk=ss.accept();
            System.out.println("Client Connected: "+count++);
            er=new Multi_user_echo_reverse(stk);
            er.start();
            
        }while(true);
        
    }
    
}
class client
{
     public static void main(String[] args) throws Exception // client
    {
        
        Socket stk=new Socket("localhost",2000); // 2000 is server port no.
        
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg; 
        do
        {
            msg=key.readLine();// reading
            ps.println(msg);// writing
            msg=br.readLine();
            System.out.println("MESSAGE FROM SERVER: "+msg);
        }while(!msg.equals("dne"));
        stk.close();
    }
    
}

