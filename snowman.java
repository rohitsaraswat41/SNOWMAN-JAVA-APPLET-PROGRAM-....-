/*<APPLET code = "snowman.java" width = 500 height = 500 >
</APPLET>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class snowman extends Applet implements ActionListener{
Button b1=new Button("Right");
Button b2=new Button("Left");
Button b3=new Button("up");
Button b4=new Button("Down");
int x=100,y=100;
public void init(){

add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
 if(e.getSource()==b1){
x=x+10;
}
 if(e.getSource()==b2){
x=x-10;
}
 if(e.getSource()==b3){
y=y-10;
}
 if(e.getSource()==b4){
y=y+10;
}
repaint();
}


   public void paint(Graphics g)
    {
         setBackground(Color.GREEN);
        g.setColor(Color.white);
        g.drawOval(x+330,y+180,120,120);// head
        g.drawOval(x+250,y+300,280,280);//body
        g.fillOval(x+330,y+180,120,120);// head
        g.fillOval(x+250,y+300,280,280);//body
	
        g.setColor(Color.black);
	
        g.drawOval(x+360,y+210,20,20);//eye1
        g.drawOval(x+400,y+210,20,20);//eye2
	
        g.drawArc(x+375,y+240,30,50,0,-180);//mouth
        g.fillArc(x+375,y+240,30,50,0,-180);//mouth
        g.fillOval(x+360,y+210,20,20);//eye1
        g.fillOval(x+400,y+210,20,20);//eye2
	g.drawOval(x+380,y+370,20,20);//Button 1
	g.drawOval(x+380,y+400,20,20);//Button 2
	g.drawOval(x+380,y+430,20,20);//Button 3
      
        
    }
}