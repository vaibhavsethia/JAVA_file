import java.awt.*; 
import java.applet.*; 
  
  /* 
<applet code="app_status" width=200 height=60 > 
</applet> 
 */
public class app_status extends Applet implements Runnable { 
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
        g.drawString("SEE BELOW FOR STATUS", x, y); 
        showStatus("ENDING OF THE PAGE : GREETINGS");
    } 
} 
