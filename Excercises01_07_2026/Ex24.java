// Write a Java program to generate the following @'s triangle.

// Test Data
// Input the number: 6
// Expected Output :

//       @                                                  
//      @@                                                  
//     @@@                                                  
//    @@@@                                                  
//   @@@@@                                                  
//  @@@@@@
package Excercises01_07_2026;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}