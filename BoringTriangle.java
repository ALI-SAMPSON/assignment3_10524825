import java.awt.*;
import javax.swing.*;
public class BoringTriangle extends Canvas{
    public void paint(Graphics g)
    {
        Polygon tri = new Polygon();
        tri.addPoint(300,100);
        tri.addPoint(400,350);
        tri.addPoint(200,400);
        
       
        
        Color purple = new Color(128,0,128);
        g.setColor(purple);
        g.fillPolygon(tri);
        
    }
    
    public static void main(String[]args)
    {
        JFrame f = new JFrame();
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoringTriangle canvas = new BoringTriangle();
        f.add(canvas);
        f.setVisible(true);
        
    }
}
