class rect
{
    private double length;
    private double bredth;

    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        if(l>=0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
    }
    public double getBredth()
    {
        return bredth;
    }
    public void setBredth(double b)
    {
        if(b>=0)
        {
            bredth=b;
        }
        else
        {
            bredth=0;
        }
        
    }

    public double area()
    {
        return getLength()*getBredth();
    }
    public double perimeter()
    {
        return 2*(length+bredth);
    }
    public boolean isSquare()
    {
        if (length==bredth) return true;
        else return false;
    }
   
}

public class dataHiding_abstraction 
{
    public static void main(String[] args) 
    {
        rect obj=new rect();
        obj.setLength(10.5);
        obj.setBredth(5.5);
        System.out.println("Area: "+obj.area());
        System.out.println("peri: "+obj.perimeter());
        System.out.println("is it Square?: "+obj.isSquare());

        System.out.println("Length: "+obj.getLength());
        System.out.println("Length: "+obj.getBredth());

    }
}
