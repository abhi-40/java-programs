public class matrix_mul_twoD_array
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
                for(int k=0;k<c[0].length;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        

        }
        for(int x[]:c)
        {
            for(int y:x)
            {
                System.out.print(y+",");
            }
            System.out.println(" ");

        }
    }
}
