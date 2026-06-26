import java.util.Scanner;

public class CoffeeMachineV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int coin = 0;

        String[] coffeeNames = {"1.Americano = 1.50\n", "2.Espresso = 2.00\n", "3.Machiato = 2.50\n"};
        double[] coffeePrices = {1.50, 2.00, 2.50};
        String[] sugarLevels = {"No sugar", "One sugar", "Two sugars"};
        double[] coinValues = {0.50, 1.00, 2.00};

        System.out.println("HELLO \nWelcome to our coffee machine.\n\nPlease insert your coins!");
        System.out.println("1 = 0.50 \n2 = 1.00 \n3 = 2.00 \n4 = stop putting coins");

        do {
            coin = sc.nextInt();

            if (coin < 1 || coin > 4) {
                System.out.println("Invalid option!\nPlease 1, 2 or 3 to add more coins.");
                continue;
            }

            if (coin != 4) {
                balance += coinValues[coin - 1];
                System.out.printf("Current balance: " + balance +"\n");
            }
        }
        while (coin != 4);

        System.out.println("\nSelect coffee:");
        for (int i = 0; i < coffeeNames.length; i++) {
            System.out.printf((i + 1) + " = " + coffeeNames[i] );
        }
        String coffeeName = " ";
        double price = 0;
        int coffee;
        do {
            coffee = sc.nextInt();    
        } 
        while (coffee < 1 || coffee > coffeeNames.length);
            coffeeName = coffeeNames[coffee - 1];
            price = coffeePrices[coffee - 1];

        while (balance < price) {
            double missingAmount = price - balance;
            System.out.printf("\nNot enough money. Please add " + missingAmount + " more for a " + coffeeName + "\n");
            System.out.println("Please insert more coins:\n1 = 0.50\n2 = 1.00\n3 = 2.00");

            int extraCoin;
        do {
                extraCoin = sc.nextInt();
            }
        while (extraCoin < 1 || extraCoin > 3);

            balance += coinValues[extraCoin - 1];
        }

        System.out.println("Select sugar level!");
        for (int i = 0; i < sugarLevels.length; i++) {
            System.out.printf((i + 1) + " = " + sugarLevels[i] + "\n");
        }
        int sugar;
        do {
        sugar = sc.nextInt();
           
        } while (sugar < 1 || sugar > sugarLevels.length);

        String sugarLevel = sugarLevels[sugar - 1];
        double change = balance - price;

        System.out.println("\n=======ORDER SUMMARY=======");
        System.out.printf("Inserted money: " + balance + "\n");
        System.out.printf("Coffee: " + coffeeName + "\n");
        System.out.printf("Coffee price: " + price + "\n");
        System.out.printf("Sugar: " + sugarLevel + "\n");
        System.out.printf("Change: " + change + "\n");
        System.out.println("Thank you for your order,\n\n\nEnjoy your coffee!!!");
    }
}