
public class FindingPrimeNumbers 
{
 public static boolean isPrime(int num) 
 {
     if(num%2!=0 && num!=9 && num!= 15 && num!=18)
     {
         return true;
     }
     else 
     {
         return false;
     }
 }
 
 public static void main(String[] arg)
 {
     for(int j=1;j<=20;j++)
     {
         if(isPrime(j)==true)
         {
             System.out.println(j+"<");
         }
         else
         {
             System.out.println(j);
         }
             }
 }
}
