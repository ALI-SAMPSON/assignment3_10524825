import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class RandomTriangles extends Canvas{
    
    Random rand = new Random();
    int x =  rand.nextInt(500)+100;
    int y = rand.nextInt(500)+100;
    int color = 1 + rand.nextInt(9);


    public void paint(Graphics g)
    {
        
         int n = 0;
        while(n<10)
        {
            
            Random rand = new Random();
            int x = rand.nextInt(500)+100;
            int y = rand.nextInt(500)+100;
            int color = 0 + rand.nextInt(3);

             Polygon tri = new Polygon();
             tri.addPoint(300,100);
             tri.addPoint(400,350);
             tri.addPoint(200,400);
             
            if(color==1){
                            g.setColor(Color.red);
                            g.fillPolygon(tri);
                            }
                    else if(color==2){
                            g.setColor(Color.yellow);
                            g.fillPolygon(tri);
                            }
                    else if(color==3){
                            g.setColor(Color.blue);
                            g.fillPolygon(tri);
                            }
                      else if(color==0){
                            g.setColor(Color.cyan);
                            g.fillPolygon(tri);
                            }
                n++;
        }
               
     
    }
    
    public static void main(String[]args)
    {
        JFrame f = new JFrame("Graphics: RandomTriangles");
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomTriangles canvas = new RandomTriangles();
        f.add(canvas);
        f.setVisible(true);
    }
}
