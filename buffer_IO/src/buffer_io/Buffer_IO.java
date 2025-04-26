package buffer_io;
import java.io.*;
public class Buffer_IO {
    
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fs=new FileOutputStream("test4.txt");
        String str="Learning java programming";
        fs.write(str.getBytes());
        fs.close();
        
        FileReader fis=new FileReader("test4.txt");
        BufferedReader bis=new BufferedReader(fis);
        System.out.println( bis.markSupported());
   
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println(" String : "+bis.readLine());
        
    }
    
}
