import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {{
       Scanner sc= new Scanner(System.in);
        double balance = 0;
       
       
        System.out.println("HELLO \nWelcome to our coffe machine.\nPlease instert your coins!");
       System.out.println("How much money do you want to insert???\n1.= 0.50 $\n2.= 1 $\n3.= 2 $ \n4.= stop putting coins");
        int coin= sc.nextInt();
       switch (coin) {
                case 1:
                balance +=0.50;
                break;
                
                case 2:
                balance +=1;
                break;

                case 3:
                balance +=2;
                break;
                
                case 4:
                break;            
            }
    
     System.out.println("Current balance: " + balance + "$");
    
    }
    Scanner sc1= new Scanner(System.in);
        System.out.println("\nSelect coffee:\n1 = Americano -1.0$\n2 = Espresso-1.50$\n3 = Machiato 2.00$ ");
            String coffename = "";
            double price = 0;
            int coffee = sc1.nextInt();
        
        switch (coffee) {
                case 1:
                coffename = "Americano";
                price = 1.0;
                break;
                case 2:
                coffename = "Espresso";
                price = 1.50;
                break;
                case 3:
                coffename = "Machiato";
                price = 2.00;
                break;
        }
    Scanner sc2= new Scanner(System.in);
        System.out.println("Select sugar level! \n1 = no sugar \n2 = one sugar \n3 = two sugars");
        int  sugar= sc2.nextInt();        
        String sugar1 = "";
               switch(sugar)    {
                case 1:
                    System.out.println("No sugar");
                    break;

                    case 2:
                    System.out.println("one sugar");
                    break;
                    
                    case 1:
                    System.out.println(" three sugar");
                    break;
                    
               }
           
                   
            }
    }







