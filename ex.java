
// 8. Check Vowel or Consonant

// Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

// Test Data
// Input an alphabet: p
// Expected Output :
// Input letter is Consonant


// import java.until.scanner;


// public class ex8 {
//     public static void main(String[] args) {

//  Scanner sc = new Scanner(System.in);

//         System.out.print("Input a letter: ");
//         char ch = sc.next().charAt(0);

//         System.out.println("Input letter: " + ch);

//         if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

//             System.out.println("Input letter is vowel");
//         }
//         else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//             System.out.println("Input letter is consonant");
//         }
//         else {
//             System.out.println("Error");
//         }
//     }
// }
     
     import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a letter: ");
        char ch = sc.next().charAt(0);

        System.out.println("Input letter: " + ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            System.out.println("Input letter is Vowel");
        }
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Input letter is Consonant");
        }
        else {
            System.out.println("Error: Not a valid letter");
        }
    }
}