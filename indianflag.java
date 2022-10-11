import java.applet.Applet;
import java.awt.*;
public class indianflag extends Applet
{

	public void paint(Graphics g)
		{
g.drawRect(50,50,250,150);
g.setColor(Color.orange);
g.fillRect(50,50,250,50);
g.setColor(Color.blue);
g.drawOval(130,100,90,50);
g.setColor(Color.green);
g.fillRect(50,150,250,50);
}
}