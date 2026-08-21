package parking_system;
import java.util.Scanner;
 public class Main {

    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numberOfCars;  
    int total = 0;
    int highestPrice = 0;
    int highestCar = 0;
        Price Price = new Price();
        Stay stay = new Stay();
    System.out.println("welcome to our parking system");
    System.out.println("how many cars do you wat to register???");
        numberOfCars=sc.nextInt();
        for (int i=1;i<=numberOfCars;i++){
            int hours;
                do {
                System.out.print("Car " + i + " - Number of hours: ");
                hours = sc.nextInt();

                if (hours < 0) {
                    System.out.println("Error: Hours cannot be negative.");
                }
        }while (hours < 0);

            int price =Price.Price(hours);
            String status = stay.Stay(hours);

            System.out.println("Price: " + price + " denars | Status: " + status);

            total += price;

            if (price > highestPrice) {
                highestPrice = price;
                highestCar = i;
            }
        }

        System.out.println("Total amount earned: " + total + " denars");
        System.out.println("Car that paid the most: Car " + highestCar +
                           " (" + highestPrice + " denars)");
    
    
    }

}