4package textfield_textevent;
import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements TextListener,ActionListener
{
    Label l1,l2;
    TextField tf;
    
    public myFrame()
    {
        super("Textfield application");
        l1=new Label("No text is Entered Yet");
        l2=new Label("enter key is not hited");
        tf=new TextField(20);
        tf.setEchoChar('*');
        
        tf.addTextListener(this);
        tf.addActionListener(this);
        setLayout(new FlowLayout());
        
        add(l1);
        add(tf);
        add(l2);
    }

    @Override  
    public void textValueChanged(TextEvent e)
    {
        l1.setText(tf.getText());
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       l2.setText(tf.getText());
    }
}
public class TextField_textEvent
{
    public static void main(String[] args) 
    {
        myFrame f = new myFrame();
       
        f.setSize(400, 400);
        f.setVisible(true);
    } 
}
