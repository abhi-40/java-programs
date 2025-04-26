package byte_stream;
import java.io.*;
public class Byte_Stream {

    public static void main(String[] args) throws Exception
    {
        byte b[]={'a','b','c','d'};
        ByteArrayInputStream bs=new ByteArrayInputStream(b);
        String str=new String(bs.readAllBytes());
        System.out.println(str);
        bs.close();
        
        
        
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.writeTo(new FileOutputStream ("test3.txt"));
        bos.close();
    }
    
}
