// Input number of rows (half of the diamond) : 7
//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *
package Excercises01_07_2026;
import java.util.Scanner;

public class Ex21 {
static void printSpaces(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }
    static void printStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows (half of the diamond) : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            printSpaces(n - i);
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            printSpaces(n - i);
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}