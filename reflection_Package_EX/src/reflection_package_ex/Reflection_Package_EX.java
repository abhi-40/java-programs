package reflection_package_ex;

import java.lang.reflect.*;// reflect pakage 
class my
{
    public int a;
    private int b;
    protected int c;
    int d;
    
    public my(){}
    public my(int p,int f){}
    
    public void display(int x,int y){}
    public int hello(String g,String h){return 0;}
}
public class Reflection_Package_EX {

    public static void main(String[] args) 
    {   
        my o=new my();// can be done by using this method too
        Class d=o.getClass();
       
        Class c=my.class;   
        System.out.println(c.getName());
        
        System.out.println(c.getClass());
        
        
       /* Field field []=c.getDeclaredFields();// this method returns all variables of class 
        for(Field x:field)
        {
            System.out.println(x);
        }*/
        
        /*Constructor con[]=c.getConstructors();// this method returns all constructors of class 
        for(Constructor x:con)
        {
            System.out.println("constructors are : "+x);
        }*/
        Method m[]=c.getMethods();
        for(Method x:m)
        {
            System.out.println("Methods are: "+x);
        }
    }
    
}
