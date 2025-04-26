package comparable_interface;
import java.util.*;

class Point implements Comparable
{
    int x;
    int y;
    
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString()
    {
        return "x: "+x+ " "+"y: "+y;
    }
    @Override
    public int  compareTo(Object l)
    {
        Point p=(Point)l;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else 
            return 0;
            
        }  
    }
}
public class Comparable_Interface
{
    public static void main(String[] args)
    {
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(2,5));
        ts.add(new Point(2,4));
        
        System.out.println(ts);    
    }
}
