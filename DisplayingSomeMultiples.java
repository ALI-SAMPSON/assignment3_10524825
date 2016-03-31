import java.util.Scanner;
public class DisplayingSomeMultiples
{
    public static void main(String[] arg)
    {
        
    Scanner enter = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = enter.nextInt();
        for(int i=1;i<=12;i++)
        {
           int v = i*num;
            System.out.printf("%d*%d = %d %n",num,i,v);
        }
    }
}
