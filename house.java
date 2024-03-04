import java.awt.*;
import java.applet.*;
public class house extends Applet 
{
public void paint(Graphics g) {
g.setColor(Color.BLUE);
g.drawRect(200,200,200,100);
g.drawLine(200,200,300,100);
g.drawLine(300,100,200,100);
g.drawRect(275,250,50,50);
}
}
/*<applet code ="house.class" width=400 height=400> </applet>*/