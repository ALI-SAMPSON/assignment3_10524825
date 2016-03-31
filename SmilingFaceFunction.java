import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
	       drawSmilingFace(g,100,100);
	       drawSmilingFace(g,400,350);
               drawSmilingFace(g,200,100);
               drawSmilingFace(g,800,200);
               drawSmilingFace(g,600,300);
               drawSmilingFace(g,1020,700);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
            
         //head of smiling face
        g.setColor(Color.orange);
        g.fillOval(260, 215, 180, 180);
        
        //Arc representing the mouth 
        g.setColor(Color.red);
	g.drawArc(270,180,150,200,220,100);
        
        //two eyes of the smiling face
        g.setColor(Color.magenta);
        g.fillOval(280, 250, 50, 50);
        g.fillOval(370, 250, 50, 50);
        
            	
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}
