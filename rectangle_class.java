class rect
{
    public double length;
    public double bredth;

    public double area()
    {
        return length*bredth;
    }
    public double perimeter()
    {
        return 2*(length+bredth);
    }
    public boolean isSquare()
    {
        if(length==bredth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class rectangle_class 
{
    public static void main(String... s) 
    {
        rect obj=new rect();
        obj.length=10.5;
        obj.bredth=10.5;

        System.out.println("area: "+obj.area());
        System.out.println("Peri: "+obj.perimeter());
        System.out.println("Is Square? : "+obj.isSquare());
    }
}