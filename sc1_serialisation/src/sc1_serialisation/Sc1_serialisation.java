package sc1_serialisation;
import java.io.*;
public class Sc1_serialisation {

    public static void main(String[] args) throws Exception
    {
        //writing
        FileOutputStream fos=new FileOutputStream("sc1_serialisation_test.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        float list[]={1.2f,35.7f,67.8f,45f,79f};
        
        dos.writeInt(list.length);
        
        for(float f:list)
        {
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();
        
        // reading
        FileInputStream fis=new FileInputStream("sc1_serialisation_test.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        int length=dis.readInt();
        float data;
        for(int i=0;i<length;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
    
}
