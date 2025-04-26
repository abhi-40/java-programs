import java.util.Scanner;
public class evenOdd 
    {
        public static void main(String[] args)
        {
            float n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter No To Check Even Or Odd: ");
            n=sc.nextFloat();
    
            if(n%2==0)
            {
                System.out.print("Number: "+n+"Is Even");
            }
            else
            {
                System.out.print("Number: "+n+"Is Odd");
            }
        }
    }
