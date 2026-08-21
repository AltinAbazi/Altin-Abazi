package Java_Enum;

public interface  Animal {
    void bark();    
}
class dog implements Animal{
    @Override
    public void bark(){
        System.out.println("the dog is barking");

    }

}
class main {
    public static void main(String[] args) {
        dog dog=new dog();
        dog.bark();
    }
}
