import java.util.Scanner;
public class RightTriangleChecker {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three integers:");
        int count = 0;
        
        System.out.print("Side 1:");
        int syd1 = input.nextInt();
        
        System.out.print("Side 2:");
        int syd2 = input.nextInt();
       
        System.out.print("Side 3:");
        int syd3 = input.nextInt();  
        
        System.out.println("Your three sides  are " + syd1 + " " + syd2 + " " + syd3);
        System.out.println("These sides *do* make a triangle. Yippy-skippy!");
             
        while(count == 1)
        {
        System.out.print("Side 1:");
        syd1 = input.nextInt();
        
        System.out.print("Side 2:");
        syd2 = input.nextInt();
        
        System.out.print("Side 3:");
        syd3 = input.nextInt();
        }  
       
      if(syd3 < syd2 && syd2 < syd1)
            {
              System.out.println("Your three sides  are " + syd1 + " " + syd2 + " " + syd3);
              System.out.println("These sides *do* make a triangle. Yippy-skippy!");
                     
            if(syd2 < syd1)
           {
             System.out.println(syd2 + " is smaller than " + syd1 + "." + " Try again.");
             System.out.print("Side 2:");
             syd2 = input.nextInt();         
            
            if(syd2 > syd1)
             {
             System.out.print("Side 3:");
             syd3 = input.nextInt(); 
             System.out.println("Your three sides  are " + syd1 + " " + syd2 + " " + syd3);
             System.out.println("These sides *do* make a triangle. Yippy-skippy!");
             }
           }
             if(syd3 < syd2)
            {
                System.out.println(syd3 + " is smaller than " + syd2 + "." + " Try again.");
                System.out.print("Side 3:");
                syd3 = input.nextInt();
              
             if(syd3 > syd2)
                {
                 System.out.println("Your three sides  are " + syd1 + " " + syd2 + " " + syd3);
                 System.out.println("These sides *do* make a triangle. Yippy-skippy!");
                }
            }
            else
            {
                System.out.println("     ");
            }
            }
    }
    
}
