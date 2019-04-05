import java.awt.*;
import java.awt.event.*;
 
/*
<applet code="app_adapter" width=600 height=600>
</applet>
*/ 
public class app_adapter extends Frame
{
  public app_adapter()
  {
                                 // adding MouseAdapter to frame
    PleaseHandle ph = new PleaseHandle();
    addMouseListener(ph);
 
    setSize(300, 300);
    setVisible(true);
  }
 
  public static void main(String args[])
  {
    new app_adapter();
  }
}
 
class PleaseHandle extends MouseAdapter  // second class             
{
  public void mouseClicked(MouseEvent e)
  {
    System.out.println("You clicked mouse at coordinates " + e.getX() + ", " + e.getY());
  }
} 
