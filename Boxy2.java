import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 200, 300 );

		// draw ten more boxes -- different colors, different places
                
                window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);		
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
		
		
                window.setColor(Color.GREEN);
		window.fillRect(100,80,100,100);
		window.setColor(Color.WHITE);
		window.fillRect(110,90,80,80);
                
            
                window.setColor(Color.YELLOW);
                window.fillRect(400,150,100,100);
                window.setColor(Color.WHITE);
                window.fillRect(410, 160, 80, 80);
                
                
                window.setColor(Color.RED);
                window.fillRect(550, 80, 100, 100);             
                window.setColor(Color.WHITE);
                window.fillRect(560,90,80,80);
                
                
		window.setColor(Color.CYAN);
		window.fillRect(400,300,100,100);
		window.setColor(Color.WHITE);
		window.fillRect(410,310,80,80);
                
                window.setColor(Color.PINK);
		window.fillRect(500,450,100,100);		
		window.setColor(Color.WHITE);
		window.fillRect(510,460,80,80);
		
		
                window.setColor(Color.ORANGE);
		window.fillRect(250,150,100,100);
		window.setColor(Color.WHITE);
		window.fillRect(260,160,80,80);
                
            
                window.setColor(Color.GRAY);
                window.fillRect(300,30,100,100);
                window.setColor(Color.WHITE);
                window.fillRect(310, 40, 80, 80);
                
                
                window.setColor(Color.LIGHT_GRAY);
                window.fillRect(10, 200, 100, 100);             
                window.setColor(Color.WHITE);
                window.fillRect(20,210,80,80);
                
                 window.setColor(Color.BLACK);
                window.fillRect(10,400,100,100);
                window.setColor(Color.WHITE);
                window.fillRect(20, 410, 80, 80);
                
                
                window.setColor(Color.DARK_GRAY);
                window.fillRect(600, 250, 100, 100);             
                window.setColor(Color.WHITE);
                window.fillRect(610,260,80,80);
                
	}
	
	public void drawBox( Graphics window, Color c, int x, int y )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
                
                
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
