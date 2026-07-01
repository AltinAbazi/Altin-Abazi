// 17. Right-Angle Triangle Repeating Numbers

// Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

// The pattern is as follows :

// 1
// 22
// 333
// 4444
package Excercises01_07_2026;

import java.util.Scanner;

public class Ex17 {
    static int line(int i){
        return i;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(line(i));
            }
            System.out.println();
        }
    }
}
