class constr
{
    private double length;
    private double bredth;

    public constr()
    {
        length=1;
        bredth=1;
    }
    public constr(double l,double b)
    {
        setLength(l);
        setBredth(b);
        System.out.println("non para const");
   
    }
    public constr(double s)
    {
        length=bredth=s;
    }
    public void setLength(double l)
    {
        if(l>=0)
        {
            length=l;
        }
        else
        {
            length=1;
        }
    }
    public void setBredth(double b)
    {
        if(bredth>=0)
        {
            bredth=b;
        }
        else
        {
            bredth=1;
        }
    }
    public double getLength()
    {
        return length;
    }
    public double getBredth()
    {
        return bredth;
    }
    public double area()
    {
        return getLength()*getBredth();
    }
    public double peri()
    {
        return 2*(length+bredth);
    }
}
public class constructor
{
    public static void main(String[] args) 
    {
        constr obj=new constr(10,15);
        constr obj1=new constr();

        System.out.println(obj.area());
        System.out.println(obj.peri());
    }
}
