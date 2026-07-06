// Write a Java program to create a class called Rectangle with instance variables length and width. 
// Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
// Print the values of the variables
public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle other) {
        length = other.length;
        width = other.width;
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.length);
        System.out.println("Width: " + rect1.width);
System.out.println("\n\n");
        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rect2.length);
        System.out.println("Width: " + rect2.width);
    }
}