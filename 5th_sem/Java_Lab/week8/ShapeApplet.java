/**
* Date: 30/08/17
* Purpose: Demonstrate runtime polymorphism
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class  ShapeApplet extends Applet
{
    public static void main(String[] args){
        Frame ForegroundBackgroundColor = new Frame("Mohit Bansal");
        ForegroundBackgroundColor.setSize(500, 800);
        Applet ShapeApplet = new ShapeApplet();
        ForegroundBackgroundColor.add(ShapeApplet);
        ForegroundBackgroundColor.setVisible(true);
        ForegroundBackgroundColor.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); }
        });
        System.out.println("Made by: Mohit Bansal(05414802715)\n");     
    }

    public void paint(Graphics g)
    {
	    g.setColor(Color.blue);

        g.drawLine(3,100,100,100);
        g.drawString("Line",50,120);

        g.drawOval(175,50,100,100);
        g.drawString("Circle",225,100);
        g.drawRect(5,200,125,75);
        g.drawString("Rectangle",20,225);
        
        g.fillRect(175,200,125,75);
        g.drawString("filled Rectangle",175,290);

	    g.drawRoundRect(5,300,125,75,10,10);
        g.drawString("rounded Rectangle",20,325);
   	
	    g.fillRoundRect(175,300,125,75,10,10);
        g.drawString("filled rounded Rectangle",175,390);
   	
        g.drawOval(10,400,100,50);
        g.drawString("Ellipse",20,425);
	    
		g.fillOval(175,400,100,50);
        g.drawString("filled Ellipse",175,475);
        
        g.drawString("Mohit Bansal, 05414802715 ",100,500);
   	}

}
