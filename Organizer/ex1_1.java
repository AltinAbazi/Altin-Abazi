package Organizer;
// 7. Multiplication Table

// Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

import java.util.Scanner;

 public class ex1_1 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a value that you want to multiply");
    int x =sc.nextInt();
     
    for(int i=1;i<=10;i++){
        System.out.println(x+"*"+i+"="+x*i);
     }

    }
}