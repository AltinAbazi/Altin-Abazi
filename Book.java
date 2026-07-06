// Write a Java program to create a class called "Book" with instance variables title, author, and price. 
// Implement a default constructor and two parameterized constructors:
// One constructor takes title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor
public class Book {
    private String  title;
    private String author;
    private double price;

        public Book(String title,String auhtor,double price){
        this.title=title;   
        this.author=author;
        this.price=price;
        }
        public static void main(String[] args) {
            Book book1 =new Book("Lulii i vocer","Altin Abazi",25);
            System.out.println("the name of the book is "+ book1.title);
            System.out.println("the author of the book is "+ book1.author);
            System.out.println("the price of the book is "+ book1.price+"$");

        }



    }
