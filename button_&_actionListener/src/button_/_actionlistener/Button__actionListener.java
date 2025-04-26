package button_._actionlistener;
import java.awt.*;
import java.awt.event.*;
class myFrame extends Frame implements ActionListener
{
    Label l;
    Button b;
    int count=0;
    public myFrame()
    {
        
        super("Counter app");
       
        l=new Label("   "+count);
        b=new Button("Click");
        
        b.addActionListener(this);
        add(l);
        add(b);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText("   "+count);
        
    }
    
}
public class Button__actionListener {

    
    public static void main(String[] args)
    {
        myFrame f=new myFrame();
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
        
        
    }
    
}
