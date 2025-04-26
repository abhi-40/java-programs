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
        length=l;
        bredth=b;
    }
    public constr(double s)
    {
        length=bredth=s;
    }
  
    public class constrorPractice
    {
        public static void main(String[] args) 
        {
            constr obj=new constr();
        }
    }
}