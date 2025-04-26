package bitset_ex;
import java.util.BitSet;
public class Bitset_EX 
{
    public static void main(String[] args)
    {
        BitSet bs1=new BitSet();
        
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        
        BitSet bs2=new BitSet();
         
        bs2.set(1);
        bs2.set(3);
        bs2.set(5);
        bs2.set(7);
        bs1.or(bs2);
        
        System.out.print("Or: "+bs1);
        
        System.out.println(" ");
        
        bs1.flip(0, 6);
        System.out.print(bs1);
        
    }
    
}
