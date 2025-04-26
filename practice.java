class parent
{
    int length;
    int bredth;
    int x=10;

    parent(int length,int bredth)
    {
        this.length=length;
        this.bredth=bredth;
    }
}
class child extends parent
{
    int height;
    int x=20;

    child(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}
class practice
{
    public static void main(String[] args) 
    {
        child c=new child(1,3,4);
        c.display();
    }
}