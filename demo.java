import java.util.Scanner;
class demo
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=6;
    System.out.print("Enter index to insert: ");
    int index=sc.nextInt();
    System.out.print("enter Value of index to insert: ");
    int x=sc.nextInt();
    
    int A[]=new int[10];
    A[0]=5;  A[1]=9;  A[2]=6;  A[3]=10;  A[4]=12;  A[5]=7;

        for(int d:A)
        System.out.print(d+",");
        System.out.println("");
        
        for(int i=n;i>index;i--)
        
        A[i]=A[i-1];
        A[index]=x;
        
    for(int c:A)
    
    System.out.print(c+",");
    System.out.println("");
    
   }
}