package Organizer;
import java.util.Scanner;

public class PeopleInroom {
    

 public static void main(String[] args) {
//     int PeopleInroom = 5;

//      PeopleInroom++;
//      PeopleInroom++;
//      PeopleInroom++;

// System.out.println(PeopleInroom);
//      --PeopleInroom;
//      --PeopleInroom;
// System.out.println(PeopleInroom);


//  }
// }
Scanner sc=new Scanner(System.in);
System.out.println("enter the price of the item");
int itemPrice= sc.nextInt();

 Scanner sc1=new Scanner(System.in);

System.out.println("enter the shipping cost");
// Scanner sc=new Scanner(System.in);
//  Scanner sc1=new Scanner(System.in);

int shippingCost=sc1.nextInt();

int sum= itemPrice + shippingCost;

System.out.println("the total cost is: "+sum );


 }}