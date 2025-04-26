
package met_ref_lamda_ex;
@FunctionalInterface
interface myLamda
{
    public void display(String g);
}
public class Met_Ref_lamda_EX 
{
    public static void reverse(String str)
    {
        StringBuffer s=new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
    public static void main(String[] args) 
    {
       /*myLamda m=System.out::println;
        m.display("Hey");*/
        myLamda ml=Met_Ref_lamda_EX::reverse;
        ml.display("Hello");
    }
    
}
