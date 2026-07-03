package Organizer;
// Write a Java program that takes a year from the user and prints whether it is a leap year or not.

// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

// // Click me to see the solution


import java.util.Scanner;

public class ex9{
    public static void main(String []args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a year");
        int year= sc.nextInt();
         if(year % 4 == 0){
             System.out.println("is a leap year");
        }
        else{
            System.out.println("is not a leap  year");
        }

    }
    } 
