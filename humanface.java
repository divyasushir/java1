import java.applet.Applet;
import java.awt.*;
public class humanface extends Applet
{
	public void paint(Graphics g)
	{

		g.drawString("Welcome to human face Applet", 100,50);
		g.setColor(Color.blue);
		g.drawOval(110,60,180,180);
		g.fillOval(140,100,30,20);
		g.fillOval(230,100,30,20);
		g.fillRect(195,130,5,50);
		g.drawArc(140,100,120,120,200,140);
	}

}