class Car
{
protected int i=0;
Car()
{
System.out.println("Car() running and i="+i);
}
Car(int i)
{
this.i=i;
System.out.println("Car() run and i="+i);
}
}
class Santro extends Car
{
Santro()
{
System.out.println("Santro() running and i="+i);
}
Santro(int i)
{
System.out.println("Santro(i) running and i="+i);
}
}
class carDetails
{
public static void main(String[] args)
{
Santro s=new Santro();
Santro s1=new Santro(7);
}
}