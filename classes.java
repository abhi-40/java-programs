class circle1
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

public class classes 
{
    public static void main(String[] args) 
    {
        circle1 obj=new circle1();
        circle1 obj1=new circle1();

        obj.radius=7;
        obj1.radius=9;

        System.out.println("Area is : "+obj.area());
        System.out.println("Peri is: "+obj.perimeter());
        System.out.println("Circum is: "+obj.circumference());

        System.out.println("Area 1 is : "+obj1.area());
        System.out.println("Peri 1 is: "+obj1.perimeter());
        System.out.println("Circum 1 is: "+obj1.circumference());
    } 
}
