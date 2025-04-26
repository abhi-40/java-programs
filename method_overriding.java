class tv
{
    public void switchOn()
    {
        System.out.println("tv switched on");
    }
    public void chngChannel()
    {
        System.out.println("Tv channel changed");
    }
}
class smartTv extends tv
{
    @Override
    public void switchOn()
    {
        System.out.println("smart tv switched on");
    }
    @Override
    public void chngChannel()
    {
        System.out.println("smart Tv channel changed");
    }
    public void browse()
    {
        System.out.println("smart tv browse");
    }
    smartTv(int x)
    {
        System.out.println("just an ex of para const: "+x);
    }
}
class method_overriding
{
    public static void main(String[] args) 
    {
        smartTv t=new smartTv(8);
        t.browse();
        t.switchOn();
    }
}