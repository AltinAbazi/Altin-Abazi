package inheritance;



// . Write a Java program to create a class called Shape with
//  a method called getArea(). Create a subclass called Rectangle that 
// overrides the getArea() method to calculate the area of a rectangle.
public class Shape {

    public double getArea() {
        return 0;
        }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area: " + rectangle.getArea());
        }
    }

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
        }

    @Override
    public double getArea() {
        return length * width;
        }
    }


