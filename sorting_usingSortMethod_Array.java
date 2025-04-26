public class sorting_usingSortMethod_Array 
{
    public static void main(String[] args)
    {
        String a[]={"python","java","C++","My Sql","Js","Html"};
        java.util.Arrays.sort(a);

        for(String x:a) 
        {
            System.out.print(x+",");
        }
    }
}
