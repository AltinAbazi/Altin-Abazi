// Write a Java program to display the multiplication table of a given integer.

// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
// Expected Output :

// 5 X 0 = 0                                                                        
// 5 X 1 = 5                                                                        
// 5 X 2 = 10                                                                       
// 5 X 3 = 15                                                                       
// 5 X 4 = 20                                                                       
// 5 X 5 = 25
package Excercises01_07_2026;
import java.util.Scanner;



public class Ex14 {
    static int multiplication(int x){
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Ex14 obj = new Ex14();
        for(int i=0;i<=x;i++){

        
        System.out.println(multiplication(x)+" * "+i+" = "+obj.multiplication(x)*i);
    }
    }



}
