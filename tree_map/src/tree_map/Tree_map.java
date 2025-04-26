package tree_map;
import java.util.*;
import java.util.Map.Entry;
public class Tree_map
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tm= new TreeMap<>(Map.of(1,"Abhi"  ,  2,"aman ,  3,Yash"));    // Integer = KEY , String = VALUE
        
        tm.put(4, "Ankit");
        tm.put(6, "ansh");
        
        System.out.print(tm);
        System.out.println("Celing entry: "+tm.ceilingEntry(5));
        System.out.println("ceiling key: "+tm.ceilingKey(5));
        System.out.println("first entry: "+tm.firstEntry());
        System.out.println("get: "+tm.get(1));
        
    }
    
}
