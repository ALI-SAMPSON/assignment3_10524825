
public class NumberPuzzlesANewHope
{
    public static void main(String[] arg)
    {
     for(int i =0;i<=99;i++)
        {
            for(int j=0;j<=99;j++)
            {
                for(int q=0;q<99;q++)
                {
                for(int t=0;t<=99;t++)
            {
               
             
               
               if(i+2==j-2&&j-2==q*2&&q*2==j/2&& i+j+q+t==45 )
               {
                   System.out.printf("%d,%d,%d,%d%n",i,q,j,t);
               }
            }
                }
            }
        }
    }
}
