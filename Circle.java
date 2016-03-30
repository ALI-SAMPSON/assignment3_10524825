import java.awt.*;
import javax.swing.*;

public class Circle extends Canvas{
   public void paint(Graphics  a)
   {
           Color Mygreen = new Color(0,200,0);
	   a.setColor(Mygreen);
	   a.fillOval(250, 250, 250, 250);
	   
   }
  
public static void main(String[]args)
{
	JFrame radi = new JFrame("GraphicsDemo4: Circle");
	radi.setSize(800, 600);
	radi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Circle canvas = new Circle();
	radi.add(canvas);
	radi.setVisible(true);
	
}

}

