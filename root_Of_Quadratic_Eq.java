import java.util.Scanner;
class root_Of_Quadratic_Eq 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a=sc.nextInt();
        System.out.println("enter B");
        int b=sc.nextInt();
        System.out.println("Enter C");
        int c=sc.nextInt();
        double r1=( -b+ Math.sqrt(b*b-4*a*c))/(2*a);
        double r2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("r1:"+r1);
        System.out.println("r2:"+r2);
        
    }
}