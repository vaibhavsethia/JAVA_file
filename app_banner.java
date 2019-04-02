import java.awt.*; 
import java.applet.*; 
  
  /* 
<applet code="app_banner" width=200 height=60 > 
</applet> 
 */
public class app_banner extends Applet implements Runnable { 
    private String display; 
    private int x, y, flag; 
    Thread t; 
    public void init() 
    { 
        display = "THIS IS MY FLOATING BANNER"; 
        x = 100; 
        y = 100; 
        flag = 1; 
        t = new Thread(this, "MyThread"); 
        t.start(); 
    } 
    public void update() 
    { 
  
        x = x + 10 * flag; 
        if (x > 300) 
            flag = -1; 
        if (x < 100) 
            flag = 1; 
    } 
    public void run() 
    { 
  
        while (true) { 
            repaint(); 
  
            update(); 
            try { 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException ie) { 
                System.out.println(ie); 
            } 
        } 
    } 
    public void paint(Graphics g) 
    { 
        g.drawString("HELLO", x, y); 
        g.drawString("CONTACT FOR ADVERTISING @7838708087 ", x+20, y+30);
        g.drawString("PAYTM ONLY for appointments contact @7838207098 ", x, y+60);

    } 
} 
