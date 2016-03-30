import java.awt.*;
import javax.swing.*;
public class ClockFace extends Canvas{
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.drawOval(0, 0, 100, 100);
        
        g.setColor(Color.black);
        g.drawLine(50, 50, 100, 50);
        g.drawLine(50, 50, 70, 80);
        //g.drawLine(100, 100, 100, 100);
        
    }
    
    public static void main(String[]args)
    {
        JFrame win = new JFrame("GraphicsDemo6: Clock");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace tick = new ClockFace();
        win.add(tick);
        win.setVisible(true);
    }
}
