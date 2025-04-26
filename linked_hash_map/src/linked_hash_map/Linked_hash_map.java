package linked_hash_map;
import java.util.*;
public class Linked_hash_map
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> lm=new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }
    
    };
        
        lm.put(1, "A");
        lm.put(2, "B");
        lm.put(3, "C");
        lm.put(4, "D");
        lm.put(5, "E");
        lm.put(6, "F");
        
        lm.get(1);
        lm.get(2);
        lm.get(4);
        lm.get(5);
        lm.get(6);
        
        
        lm.forEach((k,v)->System.out.println(k+" "+v));
    }
    
}
