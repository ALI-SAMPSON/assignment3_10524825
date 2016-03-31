import java.util.Scanner;
public class AreaCalulator 
{
    
    public static double area_Circle(int radius)
    {
     Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = keyboard.nextInt();
        double area = (22/7)*radius*radius;
        System.out.print(area);
        return area;
    }
    public static int area_rect(int length, int width)
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter the lenght and width of the triangle respectively");
        length = keyboard.nextInt();
        width = keyboard.nextInt();
        int area = length*width;
        System.out.print(area);
        return area;
        
    }
    public static int area_Square(int syde)
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the side of the square");
       syde = keyboard.nextInt();
       int area=syde*syde;
       System.out.print(area);
       return area;
    }
    public static double area_triangle(int base,int height)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle respectively");
        base = keyboard.nextInt();
        height = keyboard.nextInt();
        double area = 0.5*base*height;
        System.out.print(area);
        return area;
    }
    
    
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Which shape%n 1)Triangle%n2)Rectangle%n3)Sqaure%n4)Cicle%n5)Quit");
        
        int n = keyboard.nextInt();
        if(n==1)
        {
          area_triangle(0,0);  
        }
        else if(n==2)
        {
          area_rect(0,0);  
        }
        else if(n==3)
        {
          area_Square(0);  
        }
         else if(n==4) 
        {
          area_Circle(0);  
        }
         else if(n==5)
         { 
          System.out.println("Goodbye");   
         }
        else
         {
             System.out.println("Restart the program");
         }
    }
}