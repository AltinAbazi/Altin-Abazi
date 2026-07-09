package inheritance;
// . Write a Java program to create a class called Vehicle with a 
// method called drive().
//  Create a subclass called Car that overrides 
// the drive() method to print "Repairing a car"
public class Vehicle {
    public Vehicle(int vehicleId, String brand, String model, double rentalPricePerDay) {
        //TODO Auto-generated constructor stub
    }

    public void drive(){
        System.out.println("driving the car ");
    }

 public static void main(String[] args) {
        Car car =new Car();
        car.drive();

    }

 public void displayInfo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
 }
}
    class Car extends Vehicle{
       
        @Override
        public void drive(){
            System.out.println("repairing the car");
        }
    }


   