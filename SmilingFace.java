import java.awt.*;
import javax.swing.*;
public class SmilingFace extends Canvas {
    public void paint(Graphics b)
    {
        //head of smiling face
        b.setColor(Color.yellow);
        b.fillOval(250, 200, 200, 200);
        
        //Arc representing the mouth 
        b.setColor(Color.red);
	b.drawArc(270,180,150,200,220,100);
        
        //two eyes of the smiling face
        b.setColor(Color.blue);
        b.fillOval(280, 250, 50, 50);
        b.fillOval(370, 250, 50, 50);
        
        //labels
        b.setColor(Color.black);
        b.setFont(new Font(null));
        for(int X=0; X<800; X+=50)
            b.drawString(String.valueOf(X),X,50);
        for(int Y=100; Y<600; Y+= 50)
            b.drawString(String.valueOf(Y),28,Y);
        
        //lines
        b.setColor(Color.lightGray);
        for(int X=0; X<800; X+=50)
            b.drawLine(X, 0, X, 599);//horizontal
        for(int Y=0; Y<600; Y+=50)
            b.drawLine(0, Y, 799, Y);//vertical
        
        
    }
    
    public static void main(String[]args)
    {
        JFrame yeah = new JFrame("GraphicsDemo5: SmilingFace");
        yeah.setSize(800,600);
        yeah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        yeah.add(canvas);
        yeah.setVisible(true);
        
    }
}
