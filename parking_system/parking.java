// // Ushtrim në Java - Sistemi i Parkingut
// // Qëllimi: përdorimi i funksioneve (methods), user input, if/else dhe for loop.
// // Detyra
// // Krijo një program në Java për një parking. Programi duhet të lexojë të dhëna nga
// // përdoruesi dhe të llogarisë pagesën për disa vetura që hyjnë në parking.
// // 1 Kërko nga përdoruesi të shkruajë sa vetura dëshiron të regjistrojë.
// // 2 Përdor një for loop për të regjistruar të dhënat e secilës veturë.
// // 3 Për çdo veturë kërko numrin e orëve që ka qëndruar në parking.
// // 4 Krijo një funksion calculatePrice(int hours) që kthen çmimin e parkingut sipas numrit
// // të orëve.
// // 5 Në funksionin e llogaritjes përdor if / else if / else me këtë logjikë: deri në 2 orë = 50
// // denarë; 3 deri në 5 orë = 100 denarë; mbi 5 orë = 150 denarë.
// // 6 Krijo një funksion tjetër që kontrollon nëse qëndrimi është i shkurtër apo i gjatë.
// // Nëse vetura ka qëndruar më shumë se 5 orë, shfaq "Qëndrim i gjatë"; përndryshe
// // shfaq "Qëndrim normal".
// // 7 Për çdo veturë shfaq numrin rendor, numrin e orëve, çmimin dhe statusin e
// // qëndrimit.
// // 8 Në fund, llogarit dhe shfaq shumën totale të fituar nga të gjitha veturat.
// // Kushte shtesë
// // • Mos lejo që përdoruesi të fusë numër negativ të orëve.
// // • Nëse fusha është e pavlefshme, shfaq një mesazh gabimi.
// // • Bonus: gjej veturën që ka paguar më shumë.
// // Outputi i pritur
// // Sa vetura dëshironi të regjistroni? 3
// // Vetura 1 - Numri i orëve: 2
// // Çmimi: 50 denarë | Statusi: Qëndrim normal
// // Vetura 2 - Numri i orëve: 4
// // Çmimi: 100 denarë | Statusi: Qëndrim normal
// // Vetura 3 - Numri i orëve: 7
// // Çmimi: 150 denarë | Statusi: Qëndrim i gjatë
// // Shuma totale e fituar: 300 denarë

// package parking_system;
// import java.util.Scanner;
// public class parking {

//     public static int  Price(int hours) {
//             if (hours <= 2) {
//                 return 50;
//             } else if (hours <= 5) {
//                 return 100;
//             } else {
//                 return 150;
//             }
//         }
//     public static String Stay(int hours) {
//             if (hours > 5) {
//                 return "Long stay";
//             } else {
//                 return "Normal stay";
//             }
//         }
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int numberOfCars;  
//     int total = 0;
//     int highestPrice = 0;
//     int highestCar = 0;
//     System.out.println("welcome to our parking system");
//     System.out.println("how many cars do you wat to register???");
//         numberOfCars=sc.nextInt();
//         for (int i=1;i<=numberOfCars;i++){
//             int hours;
//                 do {
//                 System.out.print("Car " + i + " - Number of hours: ");
//                 hours = sc.nextInt();

//                 if (hours < 0) {
//                     System.out.println("Error: Hours cannot be negative.");
//                 }
//         }while (hours < 0);

//             int price = Price(hours);
//             String status = Stay(hours);

//             System.out.println("Price: " + price + " denars | Status: " + status);

//             total += price;

//             if (price > highestPrice) {
//                 highestPrice = price;
//                 highestCar = i;
//             }
//         }

//         System.out.println("Total amount earned: " + total + " denars");
//         System.out.println("Car that paid the most: Car " + highestCar +
//                            " (" + highestPrice + " denars)");
    
    
//     }

// }
