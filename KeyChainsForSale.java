
import java.util.Scanner;
public class KeyChainsForSale
{
    Scanner input=new Scanner(System.in);
    public static void add_keychains()
            {
                Scanner input = new Scanner(System.in);
                int item0;
                System.out.println("ADD KEYCHAINS");
              
                System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item0 = input.nextInt();
                 if(item0==1)
               {
                  add_keychains(); 
               }
               else if(item0==2)
               {
                  remove_keycahin(); 
               }
               else if(item0==3)
               {
                  view_cart(); 
               }
               else if(item0==4)
               {
                  checkout(); 
               }
            }
    public static void remove_keycahin()
    {
        Scanner input = new Scanner(System.in);
       int item0;
        System.out.println("    ");
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item0 = input.nextInt();  
                 if(item0==1)
               {
                  add_keychains(); 
               }
               else if(item0==2)
               {
                  remove_keycahin(); 
               }
               else if(item0==3)
               {
                  view_cart(); 
               }
               else if(item0==4)
               {
                  checkout(); 
               }
    }
    public static void view_cart()
    {
         Scanner input = new Scanner(System.in);
        int item0;
        System.out.println("VIEW CART");
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item0 = input.nextInt(); 
                 if(item0==1)
               {
                  add_keychains(); 
               }
               else if(item0==2)
               {
                  remove_keycahin(); 
               }
               else if(item0==3)
               {
                  view_cart(); 
               }
               else if(item0==4)
               {
                  checkout(); 
               }
    }
    public static void checkout()
    {
        System.out.println("CHECKOUT");
    }
    
    public static void main(String[] arg)
    {
        System.out.println("THE C3NTYN3NTC3NTYN3L's SHOPPINGMALL");
          Scanner input = new Scanner(System.in);
        int item0;
        
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.println("Please choose an option");
               item0 = input.nextInt();    
               if(item0==1)
               {
                  add_keychains(); 
               }
               else if(item0==2)
               {
                  remove_keycahin(); 
               }
               else if(item0==3)
               {
                  view_cart(); 
               }
               else if(item0==4)
               {
                  checkout(); 
               }
        
      
    }
}   
