import java.util.Scanner;
public class loop
{
    public static void main(String[] args) 
    {
      int sum=0;
      int r=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no: "); 
      int n=sc.nextInt();
      int m=n;
      while(n>0)
      {
       r=n%10;
       sum=sum+r*r*r;
       n=n/10;
      }
      if(m==sum)
      {
        System.out.println("Armstring");
      }
      else{
        System.out.println("not");
      }
     
    }
}

