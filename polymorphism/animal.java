package polymorphism;
// Write a Java program to create a base class Animal (Animal Family)
//  with a method called Sound(). Create two subclasses Bird and Cat. 
// Override the Sound() method in each subclass to make a specific
//  sound for each anima
public class animal {

    public void Sound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {

        Bird bird = new Bird();
        Cat cat = new Cat();

        bird.Sound();
        cat.Sound();
    }
}

class Bird extends animal {

    @Override
    public void Sound() {
        System.out.println("Bird says: Tweet");
    }
}

class Cat extends animal {

    @Override
    public void Sound() {
        System.out.println("Cat says: Meow");
    }
}