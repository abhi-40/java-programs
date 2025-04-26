package textarea_awt;
import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements ActionListener
{
    TextArea ta;
    Label l;
    Button b;
    TextField tf;
    
    public myFrame()
    {
        super("TextArea app");
        l=new Label("Nothing is entered here");
        b=new Button("CLICK");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        
        b.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // l.setText(ta.getText());
        // tf.setText(ta.getText());
      //  ta.append(tf.getText());
        //ta.append(tf.getSelectedText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
       
}
public class TextArea_awt 
{
    public static void main(String[] args)
    {
        myFrame f =new myFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
