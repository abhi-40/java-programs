package listbox_choice_awt;
import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;
    
    public myFrame()
    {
        super("Demo");
        l=new List(4,true);
        c=new Choice();
        ta =new TextArea(20,30);
        
        l.add("mon");
        l.add("tue");
        l.add("wed");
        l.add("thur");
        l.add("fri");
        l.add("sat");
        l.add("sunday");
        
        c.add("june");
        c.add("july");
        c.add("aug");
        c.add("sep");
        c.add("oct");
        c.add("nov");
        c.add("dec");
        
        add(l);
        add(c);
        add(ta);
        
         l.addItemListener(this);
         c.addItemListener(this);
         l.addActionListener(this);
    }

  
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        
        if(e.getSource()==l)
        {
            ta.setText(l.getSelectedItem());
        }
        else
        {
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String list[]=l.getSelectedItems();
        String txt="";
        
        for(String x:list)
        {
            txt+=x+"\n";
        }
        ta.setText(txt);
    }
}

public class ListBox_choice_awt
{
    public static void main(String[] args)
    {
        myFrame f=new myFrame();
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
