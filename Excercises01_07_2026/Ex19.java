// 19. Pyramid with Repeating Numbers

// Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

//        1
//       2 2
//      3 3 3
//     4 4 4 4 
package Excercises01_07_2026;

import java.util.Scanner;

public class Ex19 {
    static int line(int i){
        return i;
    }

    static void printSpaces(int n, int i){
        for(int k = 1; k <= n - i; k++){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            printSpaces(n, i);
            for(int j = 1; j <= i; j++){
                System.out.print(line(i) + " ");
            }
            System.out.println();
        }
    }
}