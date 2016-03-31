
public class NumberPuzzlesArmstrongNumbers 
{
    public static void main(String[] arg)
    {
        for(int i =0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                for(int t=0;t<=9;t++)
            {
               int v=(i*i*i)+(j*j*j)+(t+t+t);
               int w=(v/100)%10;
               int z=(v/10)%10;
               int k=(v%10);
               
               if(w==i && z==j && k==t )
               {
                   System.out.printf("%d%d%d%n",i,j,t);
               }
            }
            }
        }
    }
    }

