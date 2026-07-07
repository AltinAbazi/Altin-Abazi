package polymorphism;
// Write a Java program to create a class Vehicle with a method
//  called speedUp(). Create two subclasses Car and Bicycle.
//  Override the speedUp() method in each subclass to increase 
// the vehicle's speed differently.
public class vehicle {
    private int speed;
    
     public void speedUp() {
        speed+=10;
    }
public int getSpeed(){
    return speed;
    }
}
class car extends vehicle{
@Override
public void speedUp(){
    super.speedUp();
    System.out.println("car speed increased ");    
        }
    }
class motorcycle extends vehicle{       
@Override
public void speedUp(){
    super.speedUp();
    System.out.println("motorcycle speed increased");
        }
}
class test{ 
public static void main(String[] args) {
 car car = new car();
 motorcycle motorcycle = new motorcycle();

System.out.println("cars speed "+ car.getSpeed());
System.out.println("motorcycles speed "+ motorcycle.getSpeed());

car.speedUp();
motorcycle.speedUp();


System.out.println("cars speed "+ car.getSpeed());
System.out.println("motorcycles speed "+ motorcycle.getSpeed());




}
}

