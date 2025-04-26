import java.util.Scanner;
public class matchesExpression 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number: ");
        String num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("Binary");
        }
        else
            if(num.matches("[0-7]+"))
            {
                System.out.println("Octal");
            }
            else 
            if(num.matches("[0-9]+"))
            {
                System.out.println("Decimal");
            }
        else 
            if(num.matches("[0-9A-F]+"))
            {
                System.out.println("Hexa");
            }
        else
            System.out.println("Invalid number");
    }
}    