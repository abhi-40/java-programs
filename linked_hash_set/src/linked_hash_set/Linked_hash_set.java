package linked_hash_set;
import java.util.*;
public class Linked_hash_set 
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(5); // it will store the values in the same manner where as in hash map it stores in sorted way
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("T");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");// duplicates not allowed
        
        Iterator<String> it= lhs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
