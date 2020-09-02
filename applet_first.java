import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
public class applet_first extends Applet{
    
    Font f1;
    public void init(){
    	f1=new Font("Arial",Font.BOLD,45);
    }
    public void paint(Graphics g)  
    { 
        g.drawString("Hello World", 500, 400); 
        
        g.setFont(f1);
        g.drawString("Hello World", 500, 600); 
    } 
}


