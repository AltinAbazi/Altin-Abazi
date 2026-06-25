import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
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
                break;            }
    
     System.out.println("Current balance: " + balance + "$");
    
            }

}