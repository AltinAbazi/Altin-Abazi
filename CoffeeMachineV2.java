        import java.util.Scanner;

public class CoffeeMachineV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int coin = 0;

        String[] coffeeNames = {"1.Americano = 1.50\n", "2.Espresso = 2.00\n", "3.Machiato = 2.50\n"};//Array in which for the double function we gave each and everyone a value 
        double[] coffeePrices = {1.50, 2.00, 2.50}; //the coffee  prices in which were declared in the array up
        String[] sugarLevels = {"No sugar", "One sugar", "Two sugars"};//arrayin which we declared the sugar levels in which we will use later on
        double[] coinValues = {0.50, 1.00, 2.00};//the value of the coins in which we will need to buy later on a coffe of our choice.

        System.out.println("HELLO \nWelcome to our coffee machine.\n\nPlease insert your coins!");//output on the screen of our pressentation
        System.out.println("1 = 0.50 \n2 = 1.00 \n3 = 2.00 \n4 = stop putting coins");//output of the options to choose for inesrting coins


        do {//Loop function in which we will continue to add coins until we press the numnber 4 in which in this case would stop the loop
            coin = sc.nextInt();//user input for coins

            if (coin < 1 || coin > 4) {//condition if the user adds another number except for 1,2,3,4
                System.out.println("Invalid option!\nPlease 1, 2 or 3 to add more coins.");//output of the condition
                continue;//if the condition is met this tells the programm to continue and skip the rest of the loop and contiue to the next step
            }

            if (coin != 4) {//condition that says if the number is not 4 then continue to add coins
                balance += coinValues[coin - 1];//this adds the inserted coins to the balance 
                System.out.print("Current balance: " + balance +"\n");//output of the balance after inserting coins
            }
        }
        while (coin != 4);//this is the other part of the loop that repeats the do function as long as the number is not 4

            System.out.println("\nSelect coffee:");//output od the selection of the coffee in which we declared in the array
        for (int i = 0; i < coffeeNames.length; i++) {//thee function that prints the names of the  coffees one by one from the array
            System.out.print((i + 1) + " = " + coffeeNames[i] );//output of the coffe names
        }
        String coffeeName = " ";//declared variable for coffenames to store the coffees
        double price = 0; //declared variable for price  to store the price of the coffees
        int coffee;//declared variable to store the coffee chosen by the user
        do {//do functions that reads the choice of the users input for the coffee
            coffee = sc.nextInt();    //funtion to choose one coffee
        } 
        while (coffee < 1 || coffee > coffeeNames.length);//funtion in which the loop will repeat until a valid number is inserted
            coffeeName = coffeeNames[coffee - 1];//this functon thells the  coffees
            price = coffeePrices[coffee - 1];//this function tells the coffe price

        while (balance < price) {//this funtion sees if the balance that we insterted id enough to buy the coffe.If it is not enough then it wiil tell us to add more money until we have more money
            double missingAmount = price - balance;
            System.out.print("\nNot enough money. Please add " + missingAmount + " more for a " + coffeeName + "\n");//this tells us how much more money wee need
            System.out.println("Please insert more coins:\n1 = 0.50\n2 = 1.00\n3 = 2.00");

            int extraCoin;//declared variable in which we will need for adding extra coins  
        do {
                extraCoin = sc.nextInt();//user input for more coins
            }
        while (extraCoin < 1 || extraCoin > 3);//condition for the coin to be from the number 1-3

            balance += coinValues[extraCoin - 1];//this adds the extra coin inserted to our balance 
        }

        System.out.println("Select sugar level!");//output for sugar level
        for (int i = 0; i < sugarLevels.length; i++) {//the function that prints the options for sugar level one by one from the array
            System.out.print((i + 1) + " = " + sugarLevels[i] + "\n");//output of the sugar levels
        }
        int sugar;//declared variable for adding sugar to our coffe
        do {
        sugar = sc.nextInt();//user input for sugar
           
        } while (sugar < 1 || sugar > sugarLevels.length);//condition for the sugar to be from the number 1-3

        String sugarLevel = sugarLevels[sugar - 1];


        System.out.println("\n=======ORDER SUMMARY=======");//these are all outputs at the endof the programm as in form of a receipt
        System.out.print("Inserted money: " + balance + "\n");
        System.out.print("Coffee: " + coffeeName + "\n");
        System.out.print("Coffee price: " + price + "\n");
        System.out.print("Sugar: " + sugarLevel + "\n");
        System.out.println("Thank you for your order,\n\n\nEnjoy your coffee!!!");
    }
}