import java.applet.Applet; 
import java.awt.Graphics; 

/* 
<applet code="app_message" width=200 height=60 > 
</applet> 
 */

public class app_message extends Applet  
{ 
    public void paint(Graphics g)  
    { 
        g.drawString("Hello World", 20, 20); 
    } 
      
} 
