class circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
class cylinder extends circle
{
    public double height;

    public double volume()
    {
        return area()*height;
    }
}
public class inheritance 
{
    public static void main(String[] args) 
    {
        cylinder obj=new cylinder();

        obj.radius=7;
        obj.height=10;

        System.out.println("Area Is:"+obj.area());
        System.out.println("Perimeter Is:"+obj.perimeter());
        System.out.println("volume is:"+obj.volume());
    }
}