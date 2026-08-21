package Java_Enum;

public class shape {
    public enum Shape{
        SQUARE,
        CYLINDER,
        RECTANGLE,  
        TRIANGLE,
        PENTAGON,
        HEXAGON,
        OCTAGON
    }
    public static void main(String[] args) {
        Shape shape1= Shape.SQUARE;
        Shape shape2 = Shape.HEXAGON;
        System.out.println("the first shape is a "+shape1);
        System.out.println("the second shape is a "+shape2);


    }

}
