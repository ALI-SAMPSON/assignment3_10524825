
import java.util.Scanner;
public class EvennessFunction
{
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isDivisible(int num)
    {
        if(num%3==0)
        {
            return true;
            
        }
        else 
        {
            return false;
        }
    }
        public static void main(String[]arg)
        {
            Scanner enter = new Scanner(System.in);
            for(int i=1;i<=20;i++)
            {
                System.out.println(i);
                if(isEven(i)==true)
                {
                    System.out.println(i+"<");
                }
                 else if(isDivisible(1)==true)
                {
                    System.out.println(i+"=");
                }
                else if(isDivisible(i)==true && isEven(i)==true);
                {
                    System.out.println(i+"<=");
                }
               
                
                    System.out.println(i);
                
               
            }
        }
    }

