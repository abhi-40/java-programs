public class find_Dis_varArgs 
{
    static double discount(double ... price)
    {
        double sum=0;

        for(int i=0;i<price.length;i++)
        {
            sum=sum+price[i];
        }
        if(sum<500) 
            return sum*0.10;

            else if(sum>=500 && sum<1000)
            return sum*0.15;

            else 
            return sum*0.20;
    }
    public static void main(String[] args) 
    {
       System.out.println(discount(100));
       System.out.println(discount());
       System.out.println(discount(500,1000));
    }
}
