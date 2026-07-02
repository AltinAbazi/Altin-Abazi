
// 22. Pascal's Triangle

// Write a Java program to display Pascal's triangle.

// Test Data
// Input number of rows: 5
// Expected Output :

// Input number of rows: 5                                                          
//       1                                                                          
//      1 1                                                                         
//     1 2 1                                                                        
//    1 3 3 1                                                                       
//   1 4 6 4 1 
 package Excercises01_07_2026;

import java.util.Scanner;

public class Ex22 {
    static int factorial(int num){
        int result = 1;
        for(int k = 2; k <= num; k++){
            result *= k;
        }
        return result;
    }

    static int binomial(int row, int col){
        return factorial(row) / (factorial(col) * factorial(row - col));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(binomial(i, j) + " ");
            }
            System.out.println();
        }
    }
}