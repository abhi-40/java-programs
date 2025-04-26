import java.util.Scanner;
class fibonaaci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int a=0,b=1,c=0;
        int n=sc.nextInt();
        System.out.print(a+","+b+",");
        for(int i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
} 
