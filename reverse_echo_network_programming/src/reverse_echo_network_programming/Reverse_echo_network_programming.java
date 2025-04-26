package reverse_echo_network_programming;
//import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Reverse_echo_network_programming
{
    public static void main(String[] args) throws Exception // server
    {
        
        ServerSocket ss=new ServerSocket(2000); // 2000 is server port no.
        Socket stk=ss.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        
        do
        {
            msg=br.readLine();// reading
            
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            
            ps.println(msg);// writing
        }while(!msg.equals("dne"));
        
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
