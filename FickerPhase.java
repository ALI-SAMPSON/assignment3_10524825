
import java.util.Random;

public class FickerPhase
{
	public static void main( String[] args )
	{
		Random rand = new Random();
		int n;
		
		for ( int i=0; i<100000; i++ )
		{
			n = 1 + rand.nextInt(5);
			if(n==1)
                        {
                            first();
                        }
                       else if(n==2)
                        {
                            second();
                        }
                        else if(n==3)
                        {
                            third();
                        }
			else if(n==4)
                        {
                            fourth();
                        }
                        else if(n==5)
                        {
                            fifth();
                        }

			
		}

		System.out.println("I pledge allegiance to the flag.");
		
	}

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}

