
package second_awt_program;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


class myFrame extends Frame
{
    Label l;
    Button b;
    TextField tf;
    
    public myFrame()
    {
        super("my app");
        setLayout(new FlowLayout());
        l=new Label("hello");
        b=new Button("OK");
        tf=new TextField(2);
        
        add(l);
        add(b);
        add(tf);
    }
}

public class Second_awt_program {

    
    public static void main(String[] args)
    {
     
        myFrame f=new myFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
