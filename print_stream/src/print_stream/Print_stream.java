package print_stream;
import java.io.*;
public class Print_stream 
{
    static class student
    {
        int roll_no;
        String name;
        String dept;
    }
    public static void main(String[] args) throws Exception
    {
        //This program is for writing content 
        /**
        FileOutputStream fos=new FileOutputStream("print_stream_test.txt");
        PrintStream ps=new PrintStream(fos);
        
        student s=new student();
        s.roll_no=10;
        s.name="Abhishek";
        s.dept="IT";
        
        ps.println(s.roll_no);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();**/
        
        // This code is for reading content from file
        FileInputStream fis=new FileInputStream("print_stream_test.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        
        student s=new student();
        s.roll_no=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        
        System.out.print("Roll no: "+s.roll_no+"\nName: "+s.name+"\nDept: "+s.dept+" ");
        fis.close();
        br.close();
    }
    
}
