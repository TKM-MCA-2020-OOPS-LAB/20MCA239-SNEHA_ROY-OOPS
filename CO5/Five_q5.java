import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Five_q5 extends Applet implements ActionListener{
Button b1,b2,b3,b4;
TextField t1,t2,t3;
Label l1,l2,l3;
       public void init(){
l1=new Label("num 1 ");
l2=new Label("num 2");
l3=new Label("Result");

t1=new TextField();
t2=new TextField();
t3=new TextField();




t1.setBounds(210,40,100,20);
t2.setBounds(210,80,100,20);
t3.setBounds(210,120,100,20);

l1.setBounds(100,40,100,20);
l2.setBounds(100,80,100,20);
l3.setBounds(100,120,100,20);

b1=new Button("add");
b2=new Button("sub");
b3=new Button("mult");
b4=new Button("div");


b1.setBounds(80,150,60,50);
b2.setBounds(130,150,60,50);
b3.setBounds(180,150,60,50);
b4.setBounds(230,150,60,50);

add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

setLayout(null);
   }
 public void actionPerformed(ActionEvent e){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
      if(e.getSource()==b1){
      int s=a+b;
      t3.setText(String.valueOf(s));
      }
      if(e.getSource()==b2){
      t3.setText(String.valueOf(a-b));
      }
      if(e.getSource()==b3){
      t3.setText(String.valueOf(a*b));           
      }
      if(e.getSource()==b4){
      t3.setText(String.valueOf(a/b));           
      }
     

   }
}
