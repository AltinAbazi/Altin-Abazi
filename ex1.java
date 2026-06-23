// 1. Check Positive or Negative Number

// Write a Java program to get a number from the user and print whether it is positive or negative.

// Test Data
// Input number: 35
// Expected Output :
// Number is positive
import java.util.Scanner;
public class ex1 {
         public static void main(String[] args) {

            Scanner value= new Scanner(System.in);

            System.out.println("input number:");
            int number =value.nextInt();

            if(number > 0)
            {
                System.out.print("the number is possitive");
            }

            else if(number <0 )
            {
                System.out.print("the number is negative");
            }
             else
            {
                System.out.print("the number is zero ");
            } 
            




}            



}
