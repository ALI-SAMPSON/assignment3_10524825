
import java.util.Scanner;
public class MoreNumberPuzzles 
{
    public static void function56()
    {
         for(int i =0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                int v=i+y;
                if(i<=5 && y<=6 && v>10){
                System.out.println("("+i+j+")");
                
                }
            }
        } 
    }
         public static void reversefunc()
         {
             for(int i =0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                int v=i-j;
                int t=j-i;
                int f=j+i;
                if(f==f && t==f){
                System.out.println("("+i+j+")");
                
                }
            }
        } 
         }
    
    public static void  main(String[] arg)
    {
        int t=0;
    
        while(t==0)
        {
            Scanner input = new Scanner(System.in);
        
      System.out.println("1)Find two digit numbers <= 56 with sums of digits > 10");
      System.out.println("2)Find two digit number minus number reversed which equals sum of digits");
      System.out.println("3)Quit");
      int n=input.nextInt();
      if(n==1)
      {
          function56();
      }
      else if(n==2)
      {
          reversefunc();
      }
      else if(n==3)
      {
        break;  
      }
    }
    
}
}
