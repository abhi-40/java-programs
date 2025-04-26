class cylinder
{
    private double radius;
    private double height;

    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    {
        if(r>=0)
        {
            radius=r;
        }
        else 
        {
            radius=0;
        }
    }
    public void setHeight(double h)
    {
       if(h>=0)
       {
            height=h;
       }
       else
       {
            height=0;
       }
    }
    public cylinder()
    {
        radius=1;
        height=1;
        System.out.println("def");
    }
    public cylinder(double r)
    {
        radius=1;
        height=1;
    }
    public cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
    public double lidArea()
    {
        return Math.PI*radius*radius;
       
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

public class cylinder_constructor 
{
    public static void main(String[] args) 
    {
        cylinder obj=new cylinder();
        
        obj.setHeight(10);
        obj.setRadius(7);

        System.out.println(obj.lidArea());
        System.out.println(obj.perimeter());

        System.out.println(obj.getHeight());
        System.out.println(obj.getRadius());
        
    }
}
