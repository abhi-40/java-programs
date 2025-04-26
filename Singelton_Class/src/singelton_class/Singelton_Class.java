
package singelton_class;

class coffeeMachine
{
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;
    private static coffeeMachine m =null;
    
    private coffeeMachine()
    {
        coffeeQty=0.1f;
        waterQty=0.1f;
        milkQty=0.1f;
        sugarQty=0.1f;
    }
    
    public static coffeeMachine show()
    {
        if(m==null)
        {
            m= new coffeeMachine();
        }
        return m;
    }
}

public class Singelton_Class {

 
    public static void main(String[] args) {
        coffeeMachine m1= coffeeMachine.show();
        coffeeMachine m2= coffeeMachine.show();
        coffeeMachine m3= coffeeMachine.show();
        //System.out.println(coffeeMachine.m1);
        System.out.println(m1+","+m2+","+m3);
        if(m1==m2 && m2==m3)
        {
            System.out.println("All are same");
        }
    }
    
}
