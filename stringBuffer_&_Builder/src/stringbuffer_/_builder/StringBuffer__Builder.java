
package stringbuffer_._builder;

public class StringBuffer__Builder {

    public static void main(String[] args) 
    {
        String s1=new String("HELLO");
        StringBuffer s2=new StringBuffer("HELLO");
        StringBuilder s3=new StringBuilder("HELLO");
        
        
        s1.concat("WORLD");// this is imutable so it cant modify like s2 & s3
        s2.append("WORLD");
        s3.append("WORLD");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
