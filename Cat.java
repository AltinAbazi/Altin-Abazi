// Write a Java program to create a class called "Cat" with instance variables name and age.
// Implement a default constructor that initializes the name to "Unknown" and the age to 0.
// Print the values of the variables.

public class Cat {
    private String name;
    private int age;

    public Cat(){
        this.name="unknown";
        this.age=0;
    }

    public String getName(){
        return name;

    }
    public int getAge(){
        return age;

    }
    public static void main(String[] args) {
      Cat cat =new Cat();
    // cat.getName();
    // cat.getAge();
      System.out.println("the cats name is = "+ cat.getName());
      System.out.println("the cats age is = "+ cat.getAge());

    }
}
