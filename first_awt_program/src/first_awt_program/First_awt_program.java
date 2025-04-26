package first_awt_program;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class First_awt_program 
{
    public static void main(String[] args)
    {
        Frame f=new Frame("First App 😎");
        f.setLayout(new FlowLayout());
        
        Label l=new Label("Name Label : ");
        TextField tf=new TextField("text field: "+20);
        Button b=new Button("Button");
        
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setSize(600,600);
        f.setVisible(true);
        
    }
    
}
