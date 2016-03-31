import java.util.Scanner;
public class ARefresher 
{
    public static void main(String[] arg)
    {
    Scanner enter = new Scanner (System.in);
    System.out.println("Enter your name");
    String name = enter.next();
    if(name.equals ("Mitchell"))
    for(int i=1 ;i<=5; i++)
    {
        System.out.printf(i+")"+name+"%n");
    }
    else
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf(i+")"+name+"%n");
        }
    }
         
    
    
    
    
}
}

