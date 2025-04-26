package data_stream;
import java.io.*;
public class Data_stream {
    static class student
    {
        int roll_no;
        float avg;
        String name;
        String dept;
    }

    public static void main(String[] args) throws Exception
    {
        // this is for writing data in file
        /*
        FileOutputStream fos=new FileOutputStream("Data_stream_test.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        student s=new student();
        s.roll_no=10;
        s.avg=80.1f;
        s.name="Abhishek";
        s.dept="IT";
        
        dos.writeInt(s.roll_no);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        
        fos.close();
        dos.close();*/
        
        // this is for reading data from file
        
        FileInputStream fis=new FileInputStream("Data_stream_test.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        student s=new student();
        
        s.roll_no=dis.readInt();
        s.avg=dis.readFloat();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        
        System.out.print("Roll no: "+s.roll_no+"\navg: "+s.avg+"\nname: "+s.name+"\ndept: "+s.dept+" ");
        fis.close();
        dis.close();
        
    }
    
}
