public class two_D_jagged_Array
{
    public static void main(String[] args) 
    {
        int a[][];
        a=new int[3][];

        a[0]=new int[3];
        a[1]=new int[5];
        a[2]=new int[8];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Using for each loop: ");
        for(int x[]:a)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
