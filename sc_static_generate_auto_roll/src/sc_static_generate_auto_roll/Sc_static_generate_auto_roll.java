package sc_static_generate_auto_roll;
import java.util.*;
class student
{
    private static String rollNo;
    private String name;
    private static int count =1;
    private String generateRollNo()
    {
        Date d=new Date();
        String rn="UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    } 
   
    
    public student(String n)
    {
        name=n;
        rollNo=generateRollNo();
        System.out.println(name+","+rollNo);
    }
}
public class Sc_static_generate_auto_roll {

    public static void main(String[] args)
    {
        for(int i=0;i<5;i++){
        student s=new student("Abhishek");
        
        }
    }
    
}
