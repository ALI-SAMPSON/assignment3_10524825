
public class MultiplicationTable 
{
    
    public static void  main(String[] arg)
    {
        for(int i =1;i<=12;i++)
        {
            
            System.out.printf(" %n");
            for(int j=1;j<=9;j++)
            {
               
                int t=i*j;
                System.out.print(t+"  ");
            }
        }
    }
}
