class car
{
    public void start()
    {
        System.out.println("car is started");
    }
    public void chngGear()
    {
        System.out.println("car gear os changed");
    }
}
class luxaryCar extends car
{
    public void openRoof()
    {
        System.out.println("luxary car roof is opened");
    }
    @Override
    public void chngGear()
    {
        System.out.println("luxary car gear changed");
    }
}
public class method_overriding_ex 
{
    public static void main(String[] args) 
    {
        car obj=new luxaryCar();
        obj.chngGear();
        obj.start();
       // obj.openRoof();
    }
}