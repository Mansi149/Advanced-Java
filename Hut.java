import java.applet.*;
import java.awt.*;
public class Hut extends Applet {
	public void paint(Graphics g )
	{
		//scenery
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1800, 1000);
		
		//sun
		g.setColor (Color.orange);
		g.fillArc (100,20,80,80,0,360);
		g.drawLine (95,55,75,55);
		g.drawLine (140,105,140,125);
		g.drawLine (140,15,140,0);
		g.drawLine (185,60,205,60);
		g.drawLine (105,35,85,25);
		g.drawLine (120,20,105,5);
		g.drawLine (100,80,80,90);
		g.drawLine (115,100,100,120);
		g.drawLine (175,5,160,20);
		g.drawLine (205,25,175,35);
		g.drawLine (205,90,175,80);
		g.drawLine (175,120,160,100);
		
		//cloud
		g.setColor (Color.white);
		g.fillArc (60,130,80,50,0,360);
		g.fillArc (90,120,70,50,0,360);
		g.fillArc (130,130,80,50,0,360);

		g.fillArc (210,50,80,50,0,360);
		g.fillArc (240,30,70,50,0,360);
		g.fillArc (260,40,80,50,0,360);


		//home
		g.setColor(Color.red );
		g.fillRect(600,600,200,400);
		g.setColor(Color.black);
		g.fillRect(800,600,20,200);
		g.setColor(Color.red );
		g.fillRect(820,600,200,400);
		g.setColor(Color.blue);
		g.fillRect(760,800,100,400);
		g.setColor(Color.black);
		g.fillRect(580,600,20,400);
		g.setColor(Color.black);
		g.fillRect(1020,600,20,400);
		g.setColor(Color.black);
		g.fillRect(600,600,420,20);
		
		g.setColor(Color.blue);
		int [] x= {580,1040,810};
		int [] y= {600,600,300};		
		g.fillPolygon(x,y,3);
		
		g.setColor(Color.YELLOW);
		g.fillOval(760, 450, 100, 100);
		
		
	}
}
