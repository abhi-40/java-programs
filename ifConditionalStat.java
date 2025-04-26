import java.util.Scanner;
public class ifConditionalStat 
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter No");
            float a=sc.nextFloat();
         
            float b=sc.nextFloat();

            float c=sc.nextFloat();

            if(a>b && a>c)
            {
                System.out.println("Your no: "+ a + " A Is Biggest");
            }
            else if (b>a && b>c)
            {
                System.out.println("The Entered No i.e : "+b+ " B Is Biggest");
            }
            else if(c>a && c>b)
            {
                System.out.println("The Entered No :  "+c+ " C Is Biggest");
            }
            else
            {
                System.out.println("All Nos are Equal");
            }
        }
    }
}
