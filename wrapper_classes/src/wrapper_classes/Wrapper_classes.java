
package wrapper_classes;
public class Wrapper_classes {
    public static void main(String[] args) {
        Integer i=new Integer(56);// this meth is not suggested 
        Integer a=Integer.valueOf("90");// better use this one
        Integer b=29;
        
        Byte c=Byte.valueOf("15");
        Byte bb=15;
        Byte d=Byte.valueOf(bb);
        Byte e=90;
        
        Float f=123.09f;// same method of byte can be used for float too
        
        Double g=345.890;// same method of byte can be used for double too
        
        Character h=Character.valueOf('A');
        
        Boolean j=Boolean.valueOf(true);
        Boolean k=Boolean.valueOf("false");
        
        int m1=15;
        Integer m2=m1;//autoBoxing
        Integer m3=15;
        System.out.println(m2.equals(m2));
        System.out.println(Integer.parseInt("13"));// will convert string into number
        System.out.println(Integer.signum(-10));// will return -1 if negative,0 if value is 0,& 1 if value is positive
        System.out.println(Integer.toBinaryString(7));// returns the binary form of value
        System.out.println(Integer.toOctalString(89));// returns the octal form of value
        
        float v=67.6f;
        Float x=56.3f/0;
        System.out.println("Value is infinity: "+x.isInfinite());
        Integer z=10;
        
        Integer a1=Integer.valueOf("70");
        int a2=a1;
       
    }
    
}
