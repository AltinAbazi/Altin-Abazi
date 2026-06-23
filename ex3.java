// 3. Find Greatest Among Three Numbers

// Write a Java program that takes three numbers from the user and prints the greatest number.

// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// Expected Output :
// The greatest: 87

import java.util.Scanner;



public class ex3 {
             public static void main(String[] args) {
           
                Scanner sc1= new Scanner(System.in);
            
                System.out.print("enter the first value ");
            int first =  sc1.nextInt(); 
                
            Scanner sc2= new Scanner(System.in);
            
                System.out.print("enter the second value ");
            int second =  sc2.nextInt(); 

            Scanner sc3= new Scanner(System.in);
            
                System.out.print("enter the third value ");
            int third =  sc3.nextInt(); 

                if(first > second && first > third)
                {
                    System.out.print("the number is "+first+" and is the greatest number");
                }
    else if( second > first && second > third)
    {
        System.out.print("the number is "+second +" and is the greatest number");

    }
    else if(third > second && third > first)
        {
        System.out.print("the number is "+third +" and is the greatest number");
        }
     else 
        System.out.print("the numbers are equal");
}
}