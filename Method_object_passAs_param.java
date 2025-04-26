public class Method_object_passAs_param 
{
    static void change(int b[],int index,int value)
    {
        b[index]=value;
    }
    public static void main(String[] args) 
    {
        int b[]={2,4,6,7,9};
        change(b,1,5);
        for(int x:b)
        {
            System.out.print(x+",");
        }

    }
}
