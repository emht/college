import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class mouse_click extends Applet implements MouseListener
{  String str="";
    public void init()
    { addMouseListener(this);
}
public void mousePressed(MouseEvent e)
{ str="You pressed mouse"; 
   repaint();}
public void mouseReleased(MouseEvent e) 
{ str="You released mouse";
   repaint();}
public void mouseClicked(MouseEvent e)
{ str="You clicked mouse";
   repaint();}
public void mouseEntered(MouseEvent e)
{ str="Mouse entered frame";
   repaint();}
public void mouseExited(MouseEvent e)
{ str="Mouse existed frame"; 
   repaint();}
public void paint(Graphics g)
{ g.drawString(str,75,100); }} 