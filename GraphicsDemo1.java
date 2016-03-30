import java.awt.*;
import javax.swing.JFrame;    
public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(0,0,0,0);  // draw a rectangle
        g.fillOval(160,200,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    
}
}
//1. the width of the window is about 800 pixels and the height is 600 pixels 

//2. In the function drawRect(), the four numbers under careful study determines the size of the rectangle(sizes of the rectangle).

//3. In the fillOval function, the four numbers determine the size of the fill-in color and hence the size of the oval.

//4. The two numbers in the drawString function are the given x and y values which are derived by getWidth/2 and getHeight/2 respectively.

//5. The one drawn on top is the 1 that has lower figures and the one below is the one with highers figures.

//6. 