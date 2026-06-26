
// Create a Java program that stores the grades of 5 students in a double array.

// Requirements:

// Ask the user to enter 5 grades.
// Store each grade in the array.
// Display all entered grades.
// Calculate and display the average grade.
// Display the highest grade.
// Count how many students passed.
// A student passes if the grade is 50 or higher.

// Example output:

// Enter grade for student 1: 75
// Enter grade for student 2: 40
// Enter grade for student 3: 90
// Enter grade for student 4: 55
// Enter grade for student 5: 60

// Grades: 75.0 40.0 90.0 55.0 60.0
// Average grade: 64.0
// Highest grade: 90.0
// Passed students: 4
import java.util.Scanner;
    public class StudentGades {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
                double[] grades = new double[5];

                double sum =0;
                double highestGrade =0;
                double passed =0;
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for sudent "+(i+1)+ ":");
                grades[i] = sc.nextDouble();
                sum += grades[i];
        if (i == 0 || grades[i] > highestGrade) 
            {
            highestGrade = grades[i];
            }
        if (grades[i] >= 50) 
            {
            passed++;
            }
            }
            System.out.println("Grades : ");
            for (double grade : grades) 
            {
            System.out.print(grade + " ");
            }
        
            double average = sum / 5;
        
            System.out.println("\naverage grades: "+average);
            System.out.println("highest grade: "+highestGrade);
            System.out.println("passed student: "+passed);   
        }

    }
    

