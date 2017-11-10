import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
public class counter_applet extends Applet implements Runnable{
        int counter;
        Thread t;       
        public void init(){            
                counter = 0;
                t = new Thread(this);
                t.start();
        }       
        public void run(){               
                try{                  
                        while(counter!=10){
                                repaint();
                                Thread.sleep(1000);
                                ++counter;
                        }
                }
                catch(Exception e){
                }
        }    
        public void paint(Graphics g){      
                g.setFont(new Font("Serif",Font.ITALIC,30));
                FontMetrics fm = g.getFontMetrics();
                String s = "" + counter;
                Dimension d = getSize();
                int x = d.width/2 - fm.stringWidth(s)/2;
                int y = d.height/2;
                g.drawString(s,x,y);
                g.drawString("Mohit Bansal", 70, 70);
        }
}