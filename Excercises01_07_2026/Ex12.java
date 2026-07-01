// Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

// Test Data
// Input the 5 numbers : 1 2 3 4 5
// Expected Output :

// Input the 5 numbers :                                                            
// 1                                                                                
// 2                                                                                
// 3                                                                                
// 4                                                                                
// 5                                                                                
// The sum of 5 no is : 15                                                          
// The Average is : 3.0  

package Excercises01_07_2026;
import java.util.Scanner;
public class Ex12 {
    public static int sum(int first,int second,int third,int fourth,int fifth){
        return first+second+third+fourth+fifth; 
    }
    public static int average(int x){
        return x/5;
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    int first=sc.nextInt();
    int second=sc.nextInt();
    int third=sc.nextInt();
    int fourth=sc.nextInt();
    int fifth=sc.nextInt();
    int total=sum(fifth,fourth,third,second,first);
    int average =sum(first, second, third, fourth, fifth)/5;
    System.out.println("the sum is :"+total);
    System.out.println("the average is "+average);
}
    
}



