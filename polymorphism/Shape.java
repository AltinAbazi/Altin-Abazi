package polymorphism;



// 3. Write a Java program to create a base class Shape with a
//  method called calculateArea(). Create three subclasses: 
// Circle, Rectangle, and Triangle. Override the calculateArea()
//  method in each subclass to calculate and return the shape's area
public class Shape {
    public double calculateArea(){
        return 0;
    }
}
    class rectangle extends Shape{
    private double width;
    private double height;
    public rectangle(double width,double height){
    this.width= width;
    this.height=height;

 }
 @Override
    public double calculateArea(){
        return width*height;

        }
    }
    class triangle extends Shape {
    private double base;
    private double height;
    public triangle(double base, double height) {
    this.base = base;
    this.height = height;
        }
   @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
    class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
    this.radius = radius;
    }

@Override
    public double calculateArea() {
      
        return Math.PI * radius * radius;
    }
} 
 class Test {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        triangle triangle = new triangle(5, 9);
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
 
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());




}



}
