
// Write a Java program to create a class called Dog with instance variables name and color. 
// Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
// Print the values of the variables.
public class Dog {
    private String name;
    private String color;

    public Dog(String name,String color){
        this.name=name;
        this.color=color;

    }
public static void main(String[] args) {
    Dog dog =new Dog("Luna","black");
    System.out.println("my dogs name is "+dog.name);
    System.out.println("her color is "+dog.color);


}






}
