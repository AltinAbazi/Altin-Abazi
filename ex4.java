
// Check Positive, Negative, or Zero (with Range)

// Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number


import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = sc.nextDouble();

        System.out.println("Input value: " + number);

        if (number == 0) 
        {
            System.out.println("the number is zero");
        } 
        else if (number > 0)
            {
            System.out.println("positive number");
        } 
        else 
            {
            System.out.println("negative number");
        }

        if (number<1&& number>-1 &&number != 0) 
            {
            
                System.out.println("small number");
        }

        if (number > 1000000 || number < -1000000)
            {
            System.out.println("large number");

        }
    }
}