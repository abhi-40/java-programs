package hash_map;
import java.util.*;

public class Hash_map 
{

    public static void main(String[] args)
    {
        HashMap<Integer,String> tm= new HashMap<>(Map.of(1,"Abhi"  ,  2,"aman ,  3,Yash"));    // Integer = KEY , String = VALUE
        
        tm.put(4, "Ankit");
        tm.put(6, "ansh");
        
        System.out.print(tm);
        System.out.print("\n");
        System.out.print(tm.entrySet());
        
        System.out.println("get: "+tm.get(1));
        //System.out.println("get or default: "+tm.getOrDefault(2,"Sunny"));
       
    }    
}
