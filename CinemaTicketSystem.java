import java.util.Scanner;

public class CinemaTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] movieNames = {"Interstellar = 5.00$", "Grown Ups = 4.50$", "The Hangover = 3.50$"};
        double[] moviePrices = {5.00, 4.50, 3.50};
        boolean[] seats = new boolean[10];
        int[] selectedSeats = new int[5];
            seats[1] = true;
            seats[2] = true;
            seats[6] = true;
            System.out.println("Welcome to CINEPLEX \n\nPlease choose a movie:\n");
            for (int i = 0; i < movieNames.length; i++) {
                System.out.println((i+1) +"="+ movieNames[i]);
            }
            int movie;
            do 
            {
                movie =sc.nextInt();
                if (movie < 1 || movie > 3 ) {
                System.out.println("Invalid option!\nPlease choose again!!!");
                continue;}
            }
            while(movie<1 || movie >3 );
            
            
            System.out.println("Choose seats:\nMinimum seats = 1.\nMaximum seats = 5");
            int seatCount =sc.nextInt();
            if (seatCount < 1 || seatCount > 5) {
            System.out.println("Invalid number of seats!");}
            else {
                System.out.println("\navailable seats");
                for(int i=0;i<seats.length;i++){
                    if(!seats[i]){
                        System.out.println("seat "+(i+1)+" is available");
                    }
                    else{
                    System.out.println("seat "+(i+1)+" is booked");
                }
            }
            for(int i=0;i<seatCount;i++){
                int seat;
           
           do{
            System.out.println("select available seat for "+(i+1));
            seat= sc.nextInt();
            if (seat <1 ||seat>10){
                System.out.println("invalid number for seat!!!");
                System.out.println("please choose again!");
                continue;
            }
        
        if (seats[seat - 1]) {
        System.out.println("This seat is already booked. Please choose another seat.");
        continue;
        }

        selectedSeats[i]=seat;
        seats[seat -i]=true;
        break;
        }
        while(true);
        }
        double total = seatCount * moviePrices[movie - 1];
            double payment =0;
            double exchange;
            double missing;
            do{ 
            System.out.println("total ammount"+total+"$");
            System.out.println("enter payment ammount!");
            payment +=sc.nextDouble();
            
                    if(payment< total){
                    missing= total- payment;

                    System.out.print("not enough money!!\nPlease add +"+missing+"$ more");
                    }
                }
                    while(payment<total);
                        if (payment > total) {
                    exchange = payment - total;
                        System.out.print("this is the exchange " + exchange + "$");
                    } else {
                        System.out.print("Thank you!");
                        }
        
                System.out.println("\nBOOKING SUMMARY");
                System.out.println("Movie: " + movieNames[movie - 1]);
                System.out.println("Tickets: " + seatCount);
                System.out.print("Selected seats: ");
                     for (int i = 0; i < seatCount; i++) {
                System.out.print(selectedSeats[i] + " ");
            }

            System.out.println("\nTotal price: $" + total);
        }
    }
}
                  



        
        
        
        
        
        
        
        




