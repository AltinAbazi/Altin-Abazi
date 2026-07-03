// Create a class called Book with:

// Three fields: title (String), author (String), pages (int)
// A constructor that takes three parameters and assigns them to the fields
// A method called printDetails() that prints something like:
// "The Great Gatsby by F. Scott Fitzgerald, 180 pages"
// In main(), create two different Book objects with different values and call printDetails() on each


public class exercise {
 
    String title;
    String author;
    int pages;

    exercise(String t ,String a,int p){
    title= t;
    author =a;
    pages =p;
    }
    void display(){
    System.out.println(title +" "+author+" "+pages);
        }
    }
    class Main{
  public static void main(String[] args) {
      exercise mybook =new exercise("harry potter","altin abazi",348);
      mybook.display();
  }
}

    