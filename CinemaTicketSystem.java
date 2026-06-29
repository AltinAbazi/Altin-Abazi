import java.util.Scanner;

public class CinemaTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] movieNames = {"Interstellar = 5.00$", "Grown Ups = 4.50$", "The Hangover = 3.50$"};
        double[] moviePrices = {5.00, 4.50, 3.50};
        boolean[] seats = new boolean[10];
        int[] selectedSeats = new int[5];
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
            System.out.println("Invalid number of seats!");



    }
}
}
// import java.util.Scanner;

// public class CinemaTicketSystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] movieNames = {"Interstellar = 5.00$", "Grown Ups = 4.50$", "The Hangover = 3.50$"};
//         double[] moviePrices = {5.00, 4.50, 3.50};
//         boolean[] seats = new boolean[10];
//         int[] selectedSeats = new int[5];

//         // already booked seats
//         seats[1] = true;
//         seats[2] = true;
//         seats[6] = true;
//         System.out.println("Welcome to CINEPLEX \n\nPlease choose a movie:\n");

//         for (int i = 0; i < movieNames.length; i++) {
//             System.out.println((i + 1) + "=" + movieNames[i]);
//         }

//         int movie;
//         do {
//             movie = sc.nextInt();

//             if (movie < 1 || movie > 3) {
//                 System.out.println("Invalid option!\nPlease choose again!!!");
//                 continue;
//             }

//         } while (movie < 1 || movie > 3);

//         System.out.println("Choose seats:\nMinimum seats = 1.\nMaximum seats = 5");
//         int seatCount = sc.nextInt();

//         if (seatCount < 1 || seatCount > 5) {
//             System.out.println("Invalid number of seats!");
//         } else {

//             // display seats
//             System.out.println("\nAvailable seats:");
//             for (int i = 0; i < seats.length; i++) {
//                 if (seats[i] == false) {
//                     System.out.println("Seat " + (i + 1) + " - Available");
//                 } else {
//                     System.out.println("Seat " + (i + 1) + " - Booked");
//                 }
//             }

//             // choose seats
//             for (int i = 0; i < seatCount; i++) {
//                 int seat;

//                 do {
//                     System.out.println("Select seat number for ticket " + (i + 1) + ": ");
//                     seat = sc.nextInt();

//                     if (seat < 1 || seat > 10) {
//                         System.out.println("Invalid seat number!");
//                         continue;
//                     }

//                     if (seats[seat - 1] == true) {
//                         System.out.println("This seat is already booked. Please choose another seat.");
//                         continue;
//                     }

//                     boolean duplicate = false;

//                     for (int j = 0; j < i; j++) {
//                         if (selectedSeats[j] == seat) {
//                             duplicate = true;
//                         }
//                     }

//                     if (duplicate == true) {
//                         System.out.println("You already selected this seat. Please choose another seat.");
//                         continue;
//                     }

//                     selectedSeats[i] = seat;
//                     seats[seat - 1] = true;

//                     break;

//                 } while (true);
//             }

//             // total price
//             double total = seatCount * moviePrices[movie - 1];

//             // booking summary
//             System.out.println("\n===== BOOKING SUMMARY =====");
//             System.out.println("Movie: " + movieNames[movie - 1]);
//             System.out.println("Tickets: " + seatCount);

//             System.out.print("Selected seats: ");
//             for (int i = 0; i < seatCount; i++) {
//                 System.out.print(selectedSeats[i] + ",");
//             }

//             System.out.println("\nTotal price:" + total+"$");
//         }
//     }
// }