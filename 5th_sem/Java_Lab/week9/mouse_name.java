import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class mouse_name extends Applet implements MouseListener
{ int i=100; 
String str="";
    public void init() { 
addMouseListener(this);
}
public void mousePressed(MouseEvent e){ 
   repaint();
}
public void mouseReleased(MouseEvent e){ 
  repaint();
}
public void mouseClicked(MouseEvent e){
 str="Mohit Bansal";
}
public void mouseEntered(MouseEvent e){ 
 repaint();  
}
public void mouseExited(MouseEvent e){
   repaint();
}
public void paint(Graphics g){ 
i=i+5;
g.drawString(str,75,i);
}}