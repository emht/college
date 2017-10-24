/**
* Date: 30/08/17
* Purpose: Demonstrate runtime polymorphism
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;

public class life_of_applet extends Applet{
	  public void init() {
			  super.init();
			   System.out.println("init(): initializing resources for applet ");
	  }
	 
	  public void start() {
			  super.start();
			  System.out.println("start(): starting the Applet");
	  }
	 
	  public void stop() {
			  super.stop();
			  System.out.println("stop(): Stopping applet");
	  }
	 
	  public void paint(Graphics g) {
			  super.paint(g);
			  System.out.println("Mohit Bansal, 05414802715");

	  }
	  public void destroy() {
			  super.destroy();
			  System.out.println("destroy(): Destroy is called,Deallocating all resources");
	  }

}
