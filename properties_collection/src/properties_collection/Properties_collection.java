package properties_collection;
import java.util.*;
import java.io.*;
public class Properties_collection
{

    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();
        p.setProperty("Brand", "HP");
        p.setProperty("Processor", "i7");
        p.setProperty("model", "15s");
        
        p.storeToXML(new FileOutputStream("properties.txt"), "Laptop");
    }
    
}
