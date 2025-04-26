package tree_set;
import java.util.*;
public class Tree_set
{
    public static void main(String[] args)
    {
        TreeSet<Integer>ts=new TreeSet<>(List.of(10,30,10,50,70,90,25));
        ts.add(2);
        System.out.println("celing: "+ts.ceiling(27));
        System.out.println("Floor: "+ts.floor(27));
        System.out.println(ts);
        
    }
    
}
