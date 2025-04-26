
package sc_iostream;
import java.io.*;
public class SC_IOstream {

    public static void main(String[] args) throws Exception
    { 
        FileInputStream l=new FileInputStream("source1.txt");
            
        FileInputStream s=new FileInputStream("source2.txt"); 
        
        FileOutputStream des=new FileOutputStream("Destination.txt"); 
        SequenceInputStream sis = new SequenceInputStream(l,s);
        int b;
        while((b=sis.read())!=-1)
        {
            des.write(b);
        }
        l.close();
        s.close();
        des.close();
    }
    
}
