abstract class shape
{
    abstract public double perimeter();
    abstract public double area();
}
class circle extends shape
{
    double radius;
    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
   public double area()
    {
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape
{
    public double length;
    public double bredth;

    @Override
    public double perimeter()
    {
        return 2*(length+bredth); 
    }
    @Override
    public double area()
    {
        return length*bredth;
    }
}
public class sc_abstract_Class 
{
    public static void main(String[] args) 
    {
       rectangle obj=new rectangle();
       obj.length=98;
       obj.bredth=9;
       shape s=obj;
       System.out.println(s.area());
       System.out.println(obj.area());
    } 
}