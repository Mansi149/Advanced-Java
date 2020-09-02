import java.applet.Applet;
import java.awt.*;
public class smiley extends Applet {
	/* <applet code="SmileyExc.class" width="200" height="200">
	   </applet>
	*/
	public void paint(Graphics g) {
		  g.setColor(Color.yellow);
		  g.fillOval(800,300,150,150);   // For face
		  g.setColor(Color.black);
		  g.fillOval(830,340,15,25);     // Left Eye 
		  g.fillOval(900,340,15,25);    // Right Eye
		  
		  g.drawArc(835,355,78,50,0,-180);  // Smile
		  
	}

}
