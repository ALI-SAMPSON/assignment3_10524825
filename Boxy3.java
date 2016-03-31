import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 220, 30, 150 );

		// draw six more boxes -- different colors, different places, different sizes
                
               
                
                window.setColor(Color.RED);
                window.fillRect(550, 80, 130, 130);             
                window.setColor(Color.WHITE);
                window.fillRect(560,90,110,110);
                
                
		window.setColor(Color.CYAN);
		window.fillRect(400,300,120,120);
		window.setColor(Color.WHITE);
		window.fillRect(410,310,100,100);
                
                window.setColor(Color.PINK);
		window.fillRect(500,450,100,100);		
		window.setColor(Color.WHITE);
		window.fillRect(510,460,80,80);
		
		
                window.setColor(Color.ORANGE);
		window.fillRect(250,150,80,80);
		window.setColor(Color.WHITE);
		window.fillRect(260,160,60,60);
                
            
                window.setColor(Color.GRAY);
                window.fillRect(300,30,50,50);
                window.setColor(Color.WHITE);
                window.fillRect(310, 40, 30, 30);
                 
                            
                window.setColor(Color.DARK_GRAY);
                window.fillRect(600, 250, 100, 100);             
                window.setColor(Color.WHITE);
                window.fillRect(610,260,80,80);
                
                
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
            window.setColor(c);
            window.fillRect(x,y,100,100);
            
            window.setColor(Color.WHITE);
            window.fillRect(x+10, y+10, 80, 80);
            
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
