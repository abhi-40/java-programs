public class array_insertion
{
    public static void main(String[] args)
    {   
        int index=2;
        int x=15;
        int n=6;
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