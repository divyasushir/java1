import java.applet.Applet;
import java.awt.*;
public class applet12 extends Applet
{
public void paint(Graphics g)
{
 g.drawString("Welcome",80,50);
 g.setColor(Color.red);
 g.drawRect(20,30,40,40);
 g.setColor(Color.orange);
 g.fillOval(150,120,80,40);
 g.fillRect(80,80,60,100);
}

}