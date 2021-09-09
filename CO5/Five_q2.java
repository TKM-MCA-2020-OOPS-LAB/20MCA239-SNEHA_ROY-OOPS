import java.applet.*;
import java.awt.*;

public class Five_q2 extends Applet{
TextField t1,t2,t3;
public void init(){
t1= new TextField(5);
t2= new TextField(5);
t3=new TextField(5);

add(t1);
add(t2);
add(t3);



}
public void paint(Graphics g){
int x=0;
int y=0;
int p=0;
int z=0;
String result;

x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
p=Integer.parseInt(t3.getText());


if(x>y){
    if(x>p){
        z=x;

    }
    else{
        z=p;
    }

}
else{
    if(y>p){
        z=y;
    }
    else{
        z=p;
    }

}
result= Integer.toString(z);
g.drawString("largest among the given number is : "+result,30,30);
}
}

