public class arrray_deletion 
{
    public static void main(String[] args)
    {
        int d[]={1,2,3,4,5};
        int index=3;
        int n=4;
        for(int c:d)
        System.out.print(c+",");
        System.out.println("");

        for(int i=0;i>index;i++)
        //d[i]=d[3-1];
        d[index]=d.length-1;
       

        for(int y:d)
        System.out.print(y+",");
        System.out.println("");
    }
}
