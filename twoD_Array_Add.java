public class twoD_Array_Add 
{
    public static void main(String[] args)
    {
        int a[][]={{3,5,9},{7,6,2},{4,3,5}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[3][3];
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+",");
            }
            System.out.println("");
        }
    }
}