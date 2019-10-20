import java.awt.*;
import java.applet.*;
/* 
<applet code="DrawOval.class" width="600" height="600"> 
</applet> 
*/  
public class DrawOval extends Applet{
	public void paint(Graphics draw){
		draw.setColor(new Color(255,0,0));
		draw.drawOval(10,10,100,100);
		draw.fillOval(35,35,50,50);
	}
}