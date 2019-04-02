import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="app_mouse" width=600 height=600>
</applet>
*/
public class app_mouse extends Applet
implements MouseListener,MouseMotionListener
{
	int X=0,Y=20;
	String msg="MouseEvents";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.black);
		setForeground(Color.red);
	}
	public void mouseEntered(MouseEvent m)
	{
		setBackground(Color.magenta);
		showStatus("MOUSE ENTERED");
		repaint();
	}
	public void mouseExited(MouseEvent m)
	{
		setBackground(Color.black);
		showStatus("MOUSE EXITED");
		repaint();
	}
	public void mousePressed(MouseEvent m)
	{
		X=20;
		Y=50;
		msg="PRESSED";
		setBackground(Color.green);
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		X=20;
		Y=50;
		msg="RELEASED";
		setBackground(Color.blue);
		repaint();
	}
	public void mouseMoved(MouseEvent m)
	{
		X=m.getX();
		Y=m.getY();
		msg="MOVING";
		setBackground(Color.white);
		showStatus("MOUSE MOVED");
		repaint();
	}
	public void mouseDragged(MouseEvent m)
	{
		msg="DRAGGING...";
		setBackground(Color.yellow);
		showStatus("MOUSE MOVED TO : "+m.getX()+" , "+m.getY());
		repaint();
	}
	public void mouseClicked(MouseEvent m)
	{
		msg="CLICKED";
		setBackground(Color.pink);
		showStatus("MOUSE CLICKED");
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}
