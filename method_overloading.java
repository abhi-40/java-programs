import java.util.Scanner;
public class method_overloading
{
     double area(double bredth,double length)// rectangle
    {
        
        return length*bredth;
    }

    double area(double radius)//circle & method that is not static
    {
 
        return Math.PI*radius*radius;
    }
   
    public static void main(String[] args) 
    {
        method_overloading obj=new method_overloading();
        System.out.println("1st Method: "+obj.area(2.0,3.0));
        System.out.println("2nd method: "+obj.area(5.5));
       
    }
}