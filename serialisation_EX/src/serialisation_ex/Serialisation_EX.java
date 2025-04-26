package serialisation_ex;
import java.io.*;
class student implements Serializable
{
    private int roll_no;
    private String name;
    private float avg;
    private String dept;
    public static int varb=10;
    public transient int t;
    
    public student(){}
    
    public student(int roll,String name,float avg,String dept)
    {
        roll_no=roll;
        this.name=name;
        this.avg=avg;
        this.dept=dept;
        varb=500;
        t=500;
    }
    public String toString()
    {
        return "\nStudents Details: "+
                "\nRoll NO: "+roll_no+
                "\nName: "+name+
                "\nAvg: "+avg+
                "\nDept: "+dept+
                "\nvarb: "+varb+
                "\nt: "+t+"\n";
    }
}
public class Serialisation_EX {
    //program to write 
    /*
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos =new FileOutputStream("serialisation_test.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        student s=new student(340,"ABHI$HEK",89,"IT");
        oos.writeObject(s);
        
        fos.close();
        oos.close();
    */
    // program to read
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis =new FileInputStream("serialisation_test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        student s=(student)ois.readObject();
        
        System.out.print(s);
        
        fis.close();
        ois.close();
        
    }
    
}
