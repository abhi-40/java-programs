import java.util.Scanner;
public class leapYear
{
          public static void main(String[] args)
    {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        year=sc.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("leap");
                }
                else
                    System.out.println("Not");
            }
            else
            {
                System.out.println("leap");
            }
    }   else
    {
        System.out.println("Not");
    }

  }
   
    }
