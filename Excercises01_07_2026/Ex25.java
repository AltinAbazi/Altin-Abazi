// Write a Java program to display the number rhombus structure.

// Test Data
// Input the number: 7
// Expected Output :

                                   
//       1                                                  
//      212                                                 
//     32123                                                
//    4321234                                               
//   543212345                                              
//  65432123456                                             
// 7654321234567                                            
//  65432123456                                             
//   543212345                                              
//    4321234                                               
//     32123                                                
//      212                                                 
//       1 
// package Excercises01_07_2026;

import java.util.Scanner;

public class Ex25 {
    static void printSpaces(int count){
        for(int k = 1; k <= count; k++){
            System.out.print(" ");
        }
    }

    static void printDescending(int start){
        for(int j = start; j >= 1; j--){
            System.out.print(j);
        }
    }

    static void printAscending(int end){
        for(int j = 2; j <= end; j++){
            System.out.print(j);
        }
    }

    static void printRow(int n, int i){
        printSpaces(n - i);
        printDescending(i);
        printAscending(i);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            printRow(n, i);
        }

        for(int i = n - 1; i >= 1; i--){
            printRow(n, i);
        }
    }
}
