package io_stream_ex;
import java.io.*;
public class IO_Stream_EX
{
    public static void main(String[] args) 
    {
        // This code is for writing 
        try
        {
            FileOutputStream fs=new FileOutputStream("E://test.txt");
            String str="Learning java programming";
            fs.write(str.getBytes(), 9, str.length()-9);// "learning" is removed
            //fs.write(str.getBytes());
            fs.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.print(ex);
        }
        catch(IOException e)
        {
            System.out.print(e);
        }
        // this code is for reading from file
        try
        {
            FileInputStream fis=new FileInputStream("E://test.txt"); 
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String st=new String(b);
            System.out.print(st);
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
    }
    
}
