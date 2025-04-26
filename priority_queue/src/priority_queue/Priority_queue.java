package priority_queue;
import java.util.*;

class comp implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1,Integer o2)
    {
        if(01<02) return 1;
        if(01>02) return -1;
        return 0;   
    }
    
}
public class Priority_queue
{

    public static void main(String[] args) 
    {
       // comp c=new comp();
        PriorityQueue<Integer> pq=new PriorityQueue<>(new comp());
        pq.add(20);
        pq.add(10);
        pq.add(30); 
        pq.add(5);
        pq.add(15);
        pq.add(15);
        pq.add(3);
        //pq.add(2);
        
        System.out.println("head element is: "+pq.peek());
        
        pq.forEach((x)->System.out.print((x)+","));
        System.out.print("\n");
        
       // pq.
        
        System.out.println("After deletion: ");
        
        pq.forEach((x)->System.out.print(x+","));
    }
    
}
