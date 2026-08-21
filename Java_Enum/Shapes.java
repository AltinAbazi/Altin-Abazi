package Java_Enum;

public interface Shapes {
double getArea();
}
class rectangle implements Shapes{
    private double length;
    private double width;
public rectangle(double length,double width){
    this.length=length;
    this.width=width;
}
@Override
public double getArea(){
    return length*width;
    }
}
 class circle implements Shapes{
    private double radius;

public circle(double radius){
        this.radius=radius;
    }
@Override
public double getArea(){
    return Math.PI*radius*radius;

    }
}

 class triangle implements Shapes{
    private double height;
    private double base;

public triangle(double base,double height){
    this.base=base;
    this.height=height;
}
@Override
public double getArea(){
    return 0.5*height*base;
    }
}

  class main{
    public static void main(String[] args) {
        rectangle rectangle=new rectangle(5,10);
        circle circle=new circle(5);
        triangle triangle=new triangle(15,20 );
    System.out.println("area of rectangle "+rectangle.getArea());
    System.out.println("area of circle  "+circle.getArea());
    System.out.println("area of triangle "+triangle.getArea());

    }
}

