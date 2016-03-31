import java.awt.*;
import javax.swing.*;
public class GraphicsDemo3 extends Canvas
{
	public void paint(Graphics g)
	{
	  // lines
		g.setColor(Color.green);
		g.drawLine(10,100,400,100);
		g.setColor(Color.red);
		g.drawLine(100,50,40,150);//2.short red line that intersects the long green line
		g.setColor(Color.blue);
		g.drawLine(50,150,100,180);
		g.setColor(Color.red);
		g.drawLine(200, 200, 200, 290);//3.short red line that is roughly perpendicular to the "magenta" line.
		g.setColor(Color.magenta);
		g.drawLine(100,350,300,230);
		
		g.setColor(Color.black);
		
		//fonts
		g.drawString("Graphics are pretty neat.", 500, 100);
		g.setFont(new Font("Consolas", Font.PLAIN,36));//36-pt plain
		g.drawString("Yes,  they are.", 400, 200);
		
		g.setColor(Color.white);
		g.setFont(new Font("Times New Roman", Font.BOLD+Font.ITALIC,60));//60-pt plain
		g.drawString("Leader Lions", 300, 350);
		
		g.setColor(Color.blue);
		g.setFont(Font.decode("Times New Roman-BOLDITALIC-60"));// a different way to specify the same font
		g.drawString("Leander Lions", 290, 360);
		
		g.setColor(Color.black);
		g.setFont(new Font(null));// restore default font
		
		int x = 400, y = 490;
		g.drawRect(x, y, 150, 20);
		g.drawString("Where is the starting point?", x, y);
		g.setColor(Color.red);
		g.drawLine(x,y,x,y);//drawing a line from a point to itself makes a 1px-by-1px dot
		
	}
	
	public static void main(String[]args)
	{
		JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3 canvas = new GraphicsDemo3();
		win.add(canvas);
		win.setVisible(true);
	}

}
/*1. the four numbers in the drawing a line represent 
the length, direction, position and the alignment of the Line being drawn.*/

//4 .When drawing a rectangle, the upper-left corner is the starting point.

/*5. When drawing a string,you start from the coordinate 
 * of the first point(whether x or y).*/

/*6. When you provide a font that does not exist when
setting a custom font, then automatically the default font is applied to the text.*/

/*7. When you provide a font that is not installed on this machine when
setting a custom font, then automatically the default font on the machine is applied to the text.*/

