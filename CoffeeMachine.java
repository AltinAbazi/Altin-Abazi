    import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int coin = 0;
    
        System.out.println("HELLO \nWelcome to our coffee machine.\nPlease insert your coins!");
        System.out.println("How much money do you want to insert???\n1. = 0.50 $\n2. = 1 $\n3. = 2 $ \n4. = stop putting coins");       
        do {
            coin = sc.nextInt();
            
            switch (coin) 
            {
                case 1:
                balance += 0.50;
                break;
                case 2:
                balance += 1;
                break;
                case 3:       
                 balance += 2;
                break;
                case 4:
                break; 
            }
            
            if (coin != 4) 
            {
            System.out.println("Current balance: " + balance + " $\n");
            }    
        }
        while (coin != 4);
        System.out.println("\nSelect coffee:\n1 = Americano - 1 $\n2 = Espresso - 1.50 $\n3 = Macchiato - 2 $ ");
        String coffeeName = "";
        double price = 0;
        int coffee = sc.nextInt();
        
        switch (coffee) 
        {
                case 1:
                coffeeName = "Americano";
                price = 1.0;
                break;
                case 2:
                coffeeName = "Espresso";
                price = 1.50;
                break;
                case 3:
                coffeeName = "Macchiato";
                price = 2.00;
                break;
        }
        while (balance < price) 
        {
            double missingAmount = price - balance;
            System.out.println("\nNot enough money.Please add " + missingAmount + " $ more for a " + coffeeName + ".");
            System.out.println("Please insert more coins:\n1. = 0.50 $\n2. = 1 $\n3. = 2 $");    
            int extraCoin = sc.nextInt();
            switch (extraCoin) 
            {
                case 1:
                balance += 0.50;
                break;
                case 2:
                balance += 1;
                break;
                case 3:          
                balance += 2;
                break;
            }
        }
        System.out.println("Select sugar level! \n1 = no sugar \n2 = one sugar \n3 = two sugars");
        int sugar = sc.nextInt();        
        String sugarLevel = "";
        
        switch(sugar) 
        {
            case 1:
            sugarLevel = "No sugar";
            break;
            case 2:
            sugarLevel = "One sugar";
            break;
            case 3:
            sugarLevel = "Two sugars"; 
            break;
        }
                System.out.println("=======ORDER SUMMARY=======") ;
                System.out.println("Inserted money: "+balance);
                System.out.println("Coffee: "+coffeeName);
                System.out.println("Coffee price: "+price);
                System.out.println("Sugar: "+sugarLevel);
                System.out.println("Thank you for your order,\n\n\nEnjoy your coffe!!!");
          
    }
}