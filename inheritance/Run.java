package inheritance;

// Write a Java program to create a class called Animal with a method named move().
//  Create a subclass called Cheetah that overrides the move() method to run

 public class Run {
    public void move(){
        System.out.println("the animal is running ");
    }
}
    class cheetah extends Run{
        @Override
        public void move(){
            System.out.println("the cheetah is running!!!really fasttttt");
        }
    }
     class TEst{
        public static void main(String[] args) {
            Run animal= new Run();
            animal.move();
            cheetah cheetah = new cheetah();
            cheetah.move();     

        }
    }

