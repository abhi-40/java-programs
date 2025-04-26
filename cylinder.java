class cyl
{
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*lidArea()+circumference()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}

public class cylinder 
{
    public static void main(String[] args)
    {
        cyl obj=new cyl();
        obj.radius=7;
        obj.height=10;

        System.out.println("lid area: "+obj.lidArea());
        System.out.println("lid circum: "+obj.circumference());
        System.out.println("lid surfacearea: "+obj.totalSurfaceArea());
        System.out.println("lid volume: "+obj.volume());
    }
}
