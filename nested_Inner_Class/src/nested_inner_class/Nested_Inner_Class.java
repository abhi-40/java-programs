
package nested_inner_class;

class outer
{
    int x=20;
    inner i=new inner();
    class inner
    {
        int y=10;
        public void innerDisplay()
        {
            System.out.println(x+","+y);
        }
    }
    public void outerDisplay()
    {
       // inner i=new inner();
        i.innerDisplay();
    }
}
public class Nested_Inner_Class {

    public static void main(String[] args) {
        
        outer o=new outer();
        o.outerDisplay();
        
        outer.inner oi=new outer().new inner();
    }
    
}
