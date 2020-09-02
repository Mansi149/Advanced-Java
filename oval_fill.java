import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/* 
	<applet code = "FillOval" width = 200 height = 200></applet>
*/

public class oval_fill extends Applet{
		public void paint(Graphics g)   {
			g.setColor(Color.red);
			g.fillOval(300,200,100,200);
		}

}
