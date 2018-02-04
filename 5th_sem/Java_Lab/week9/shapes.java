import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color; 
public class shapes extends Applet{
    public void paint(Graphics g){
    g.drawLine(10,10,50,50);
g.setColor(Color.blue);
    g.drawRect(60,60,50,100);
g.setColor(Color.green);
    g.drawRoundRect(5,100,50,100,10,10); 
g.setColor(Color.red);
 g.fillRoundRect(150,20,50,100,10,10);
g.setColor(Color.cyan);
 g.fillRect(225,20,50,100);  
g.setColor(Color.orange); 
g.drawOval(10,210,50,50);
g.setColor(Color.pink);
g.fillArc(100,150,100,100,0,90);
g.setColor(Color.magenta);
g.drawArc(40,210,100,100,0,90);
g.setColor(Color.yellow);
g.drawOval(10,270,150,50);
 }
} 