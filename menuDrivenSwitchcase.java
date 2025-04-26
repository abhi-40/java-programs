import java.util.Scanner;
public class menuDrivenSwitchcase
{
    public static void main(String[] args)
    {
        int a,b;
        String option;
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("=======");
        System.out.println("ADD");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.print("Enter the first no: ");
        a=sc.nextInt();
        System.out.print("Enter the Second no: ");
        b=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter options in words : ");
        option=sc.nextLine();
        option=option.toUpperCase();
        option=option.trim();
        switch(option)
        {
            case "ADD":System.out.print("sum is :"+(a+b));
            break;
            case "MUL":System.out.println("Mul is : "+(a*b));
            break;
            case "DIV":System.out.println("Div is :"+(a/b));
            break;
            default:System.out.println("Enter valid option");
            break;
        }
    }
}