// // Write a Java program that displays the sum of n odd natural numbers.

// // Test Data
// // Input number of terms is: 5
// // Expected Output :

// // The odd numbers are :                                                            
// // 1                                                                                
// // 3                                                                                
// // 5                                                                                
// // 7                                                                                
// // 9                                                                                
// // The Sum of odd Natural Number upto 5 terms is: 25
package Excercises01_07_2026;

import java.util.Scanner;

public class Ex15 {

        static int num(int i,int sum){
            return i+sum;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n =sc.nextInt();
            int sum=0;
            System.out.println("the odd numbers are:");
            for(int i=1;i<=n;i++ ){
            int odd = 2 * i - 1;
            System.out.println(odd);
            sum = num(odd, sum);
        }       
    System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);
    }
    }
           

        
    

