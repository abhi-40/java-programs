package static_inner_class;
class outer
{
    int x=10;
    static int y=20;
    
    static class my
    {
        public void show()
        {
            System.out.print(y);// static class can only access static members
        }
    }
}
public class Static_Inner_Class {
    public static void main(String[] args) {
        
        outer.my o=new outer.my();
        o.show();
        
    }
    
}
