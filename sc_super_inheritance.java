class rect
{
    int length;
    int bredth;

    rect()
    {
        length=bredth=1;
    }
    rect(int l,int b)
    {
        length=l;
        bredth=b;
    }
}
class cuboid extends rect
{
   
    int height;

    cuboid()
    {
        height=1;
    }
    cuboid(int height)
    {
        this.height=height;
    }
    cuboid(int l,int b,int height)
    {
        super(l,b);
        this. height=height;
    }
    int volume()
    {
        return length*bredth*height;
    }
}
public class sc_super_inheritance 
{
    public static void main(String[] args) 
    {
        cuboid obj=new cuboid(5,3,10);
        System.out.println(obj.volume());
    }
}
