
public class NumberPuzzles1 
{
    
    public static void  main(String[] arg)
    {
        for(int i =0;i<=1000000;i++)
        {
            for(int j=0;j<=1000000;j++)
            {
                if(i+j==60 && i-j==14 ||i-j==-14){
                System.out.println("("+i+","+j+")");
                }
            }
        }
    }
    
}
