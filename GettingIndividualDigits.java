
public class GettingIndividualDigits 
{
     public static void  main(String[] arg)
    {
        for(int i =0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                int v = i+j;
                System.out.printf("%d%d, ",i,j);
                System.out.printf("%d+%d=%d %n",i,j,v);
            }
        }
    }
    
}
