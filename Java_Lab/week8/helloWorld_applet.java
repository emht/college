/**
* Date: 30/08/17
* Purpose: Demonstrate Hello World Applet
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class helloWorld_applet extends Applet {
    public static void main(String[] args){
        Frame ForegroundBackgroundColor = new Frame("Mohit Bansal");
        ForegroundBackgroundColor.setSize(426, 240);
        Applet helloWorld_applet = new helloWorld_applet();
        ForegroundBackgroundColor.add(helloWorld_applet);
        ForegroundBackgroundColor.setVisible(true);
        ForegroundBackgroundColor.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); }
        });
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }

    public void paint(Graphics g) {
        Color c = getForeground();
        setBackground(Color.yellow);
        setForeground(Color.blue);
        g.drawString("Hello World", 100, 50);
    }
}