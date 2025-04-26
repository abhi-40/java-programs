public class twoD_array 
{
    public static void main(String[] args)
    {
        int a[][]=new int[3][3];
        System.out.println(a.length);
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};

        int c[][];
        c=new int[5][5];

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int x[]:a)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
       
    }
}
