class student
{
    public String rollno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        
        return (float) total()/3;
    }
    public char grade()
    {
        if(average()>=60)
        {
            return 'A';
        }
        else if(average()>=60 && average()<=69)
        {
            return 'B';
        }
        else if(average()>=50 && average()<=59)
        {
            return 'C';
        }
        else if(average()>=40 && average()<=49)
        {
            return 'D';
        }
        else 
        {
            return 'F';
        }
        
    }
    public String toString()//if toString method is there then println will automatically call this method just with obj reference
    {
        return "rollno:"+rollno+"\n"+"Name:"+name+"\n"+"Course: "+course;
    }

}

public class student_class 
{
    public static void main(String[] args)
    {
        student obj=new student();
        obj.rollno="234";
        obj.name="Abhishek";
        obj.course="Bsc.IT";
        obj.m1=50;
        obj.m2=50;
        obj.m3=100;

        System.out.println("Details: "+"\n"+obj);//obj reference is only given here 
        System.out.println("Total Marks Of m1,m2,m3 is: "+obj.total());
        System.out.println("Average: "+obj.average());
        System.out.println("Grade: "+obj.grade());
    }
}
