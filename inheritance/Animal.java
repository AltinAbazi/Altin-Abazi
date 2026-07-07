package inheritance;
//  Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark
public class Animal {

    public void makeSound() {
        System.out.println("the animal makes a sound.");
    }  
}

class Cat extends Animal {
@Override
    public void makeSound() {
        System.out.println("the cat meows");
    }
}
    class Main{
public static void main(String[] args) {
    Animal animal = new Animal();
    Cat cat =new Cat();
    animal.makeSound();
    cat.makeSound();
}
}