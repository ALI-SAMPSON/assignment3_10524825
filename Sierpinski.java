import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class Sierpinski extends Canvas {

    public void paint(Graphics g)
    {
        
        int x1 = 510;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;
        int x = 512;
        int y = 382;
        
        int arr[] = new int[50000];
        
        Random r = new Random();
        
        int choice = 1 + r.nextInt(3);
        
        
        for(int i = 0; i < arr.length;i++)
        {
            g.drawLine(x,y,x,y);
            //Thread.sleep();
            
            if(choice == 1)
            {
                 int dx = (x-x1);
                 int dy = (y-y1);
                 
                 x = x - (dx/2);
                 y = y - (dy/2);
            }
            else if(choice == 2)
            {
                int dx1 = (x - x2);
                int dy1 = (y - y2);
            }
            else if(choice == 3)
            {
                int dx2 = (x - y3);
                int dy2 = (y - y3);
            }
            else
            {
                System.out.println("");
            }
            
                 
        }
          
        g.drawString("Sierpinski Triangle",462,484);
    }
    

    public static void main(String[]args)
    {
        JFrame f = new JFrame("Sierpinski Triangle");
        f.setSize(1024,768);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sierpinski canvas = new Sierpinski();
        f.add(canvas);
        f.setVisible(true);
        
        
    }
    
}


