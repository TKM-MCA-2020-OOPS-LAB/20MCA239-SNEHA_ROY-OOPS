import java.awt.*;  
import java.awt.event.*;  
public class Five_q8 extends Frame implements KeyListener
{  
    Label l;  
    TextArea area;  
    public Five_q8()
    {  
        l=new Label();  
        l.setBounds(20,50,200,40);  
        area=new TextArea();  
        area.setBounds(20,100,200,100);  
        area.addKeyListener(this);  
          
        add(l);
        add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) 
    {  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) 
    {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) 
    {  
        l.setText("Key Typed");  
    }  
    public static void main(String[] args) 
    {  
        new Five_q8();  
    }  
} 