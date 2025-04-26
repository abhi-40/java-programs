package file_handling;
import java.io.*;
public class File_handling 
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("E:\\java programs");
        //File c=new File("E:\\java programs\\test.txt");
        //c.setReadOnly();
        //FileOutputStream fos=new FileOutputStream("E:\\java programs\\test.txt");
        System.out.println(f.isDirectory());
        File[] list =f.listFiles();
        for(File x:list)
        {
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }
    }
    
}
