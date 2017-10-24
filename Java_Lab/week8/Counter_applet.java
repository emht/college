/**
* Date: 30/08/17
* Purpose: Demonstrate runtime polymorphism
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Random;
public class Counter_applet extends Applet {
  public static void main(String[] args){
    Frame ForegroundBackgroundColor = new Frame("Mohit Bansal");
    ForegroundBackgroundColor.setSize(426, 240);
    Applet Counter_applet = new Counter_applet();
    ForegroundBackgroundColor.add(Counter_applet);
    ForegroundBackgroundColor.setVisible(true);
    ForegroundBackgroundColor.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0); }
    });
    System.out.println("Made by: Mohit Bansal(05414802715)\n");        
  }

  public void paint(Graphics g) {
    g.drawString("Mohit Bansal,05414802715 ",10,10);
    Random rand = new Random();
    int x = 0 ;
    int y = 0 ;
    g.setColor(Color.black);
    try {
      while(true) {
        x = rand.nextInt(500) + 1;
        y = rand.nextInt(500) + 1;
        //500 is the maximum and the 1 is our minimum
        g.fillOval(x,y,5,5);
        // thread to sleep for 1000 milliseconds
        Thread.sleep(200);
      }
    }
    catch (Exception e) {
    System.out.println(e);
    }
  }
}