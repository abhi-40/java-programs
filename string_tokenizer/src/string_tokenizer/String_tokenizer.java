package string_tokenizer;
import java.util.*;
import java.io.*;
public class String_tokenizer 
{
    public static void main(String[] args) throws Exception
    {
        // basics of sting token
        
       /* String data ="name=Vijay;address=Delhi;country=India,dept=IT";
        
        StringTokenizer stk=new StringTokenizer(data,"=;,");
        
        String s; 
        while(stk.hasMoreElements())
        {
           s= stk.nextToken();
           System.out.println(s);
        } */
        
        FileInputStream fis=new FileInputStream("data_EX.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data2=new String(b);
        
        StringTokenizer stk=new StringTokenizer(data2,"=");
        
        String s; 
        while(stk.hasMoreElements())
        {
           s= stk.nextToken();
           System.out.println(s);
        } 
        
    }
    
}
