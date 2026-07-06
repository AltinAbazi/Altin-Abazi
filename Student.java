//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
// Implement a default constructor and a parameterized constructor that takes all three instance variables. 
// Use constructor chaining to initialize the variables. Print the values of the variables.

public class Student {
   

    private int studentId;
    private String studentName;
    private String grade;
    public Student() {
        this(000000, "Unknown", "not graded");
    }

            public Student(int studentId, String studentName, String grade) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.grade = grade;
    }

    public static void main(String[] args) {
            Student student1 = new Student();
            System.out.println("Student 1:");
            System.out.println("ID: " + student1.studentId);
            System.out.println("Name: " + student1.studentName);
            System.out.println("Grade: " + student1.grade);

            Student student2 = new Student(1339919, "Altin", "10");
            System.out.println("Student 2:");
            System.out.println("ID: " + student2.studentId);
            System.out.println("Name: " + student2.studentName);
            System.out.println("Grade: " + student2.grade);
    }
}

