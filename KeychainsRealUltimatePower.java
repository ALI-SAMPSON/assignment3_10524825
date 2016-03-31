
import java.util.Scanner;
public class KeychainsRealUltimatePower 
{

    public static int realitem,man;
    Scanner input=new Scanner(System.in);
    
    public static int add_keychains()
            {
                Scanner keyboard =new Scanner(System.in);
               int item;
               //int realitem;
                System.out.printf("How many keychains should be added%n");
                realitem = keyboard.nextInt();
                System.out.printf("You now have %d%n",realitem);
              
                System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.printf("%nPlease choose an option");
               item = keyboard.nextInt();
                 if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
                 else
               {
                   System.out.println("Error");
                   
               }
                 return realitem;
                
            }
   
    public static int remove_keycahin()
    {
        Scanner keyboard =new Scanner(System.in);
       int item;
        System.out.println("how many keychains should be removed ?");
        int del=keyboard.nextInt();
         man=realitem-del;
         System.out.printf("You now have %d keychains%n",man);
        
        
        
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.printf("%nPlease choose an option");
               item = keyboard.nextInt();  
                 if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
                 return man;
    }
    public static void view_cart()
    {
         Scanner keyboard = new Scanner(System.in);
        int item;
        System.out.printf("You now have %d keychains%n",man);
        man=man*10;
        System.out.printf("Each keychain is 10 cedis.%n Your total therefore is %d cedis ",man);
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.printf("%nPlease choose an option");
               item = keyboard.nextInt(); 
                 if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
    }
    public static void checkout()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CHECKOUT");
        System.out.println("What is your name?");
        String v = keyboard.next();
        System.out.printf("Each keychain is 10 cedis.%n Your total therefore is %d cedis%n ",man);
        System.out.printf("Thank ypu for your order, %s.",v);
        
    }
    
    public static void main(String[] arg)
    {
        System.out.println("THE C3NTYN3NTC3NTYN3L's SHOPPINGMALL");
          Scanner keyboard =new Scanner(System.in);
        int item;
        
         System.out.printf("1)ADD KEYCHAIN%n2)REMOVE KEYCHAIN%n3)VIEW CART%n4)CHECKOUT");
                System.out.printf("%nPlease choose an option");
               item = keyboard.nextInt();    
               if(item==1)
               {
                  add_keychains(); 
               }
               else if(item==2)
               {
                  remove_keycahin(); 
               }
               else if(item==3)
               {
                  view_cart(); 
               }
               else if(item==4)
               {
                  checkout(); 
               }
        
      
    }
}

