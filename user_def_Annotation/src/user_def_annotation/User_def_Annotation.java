package user_def_annotation;
import java.lang.annotation.Annotation;

@interface myAnno
{
    String name();
    String date();
    String version() default "13";
    String jdkVersion() default "23";
}

@myAnno(name="Abhishek",date="1/1/2025",jdkVersion="20")
public class User_def_Annotation {

   @myAnno(name="Aman",date="1/1/2025",jdkVersion="20")
   
    public static void main(String[] args)
    {  
        @myAnno(name="Yash",date="1/3/2025",version="10",jdkVersion="20")
        int test;
    }
    
}
