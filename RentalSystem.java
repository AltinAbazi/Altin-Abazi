// Create a Java program for a Vehicle Rental System that manages different types of vehicles available for rent.

// Your program must use user input with Scanner, so the user should enter vehicle information, rental days, and search details from the keyboard.

// Topics that must be included
// Your program must demonstrate:

// Java fundamentals
// Arrays
// Functions/methods
// Inheritance
// Encapsulation
// Polymorphism
// User input using Scanner
// Program Requirements
// Create a base class called Vehicle with private attributes:

// vehicleId
// brand
// model
// rentalPricePerDay
// Use encapsulation by making all attributes private and creating getters and setters.

// Create two child classes that inherit from Vehicle:

// Car
// Motorcycle
// The Car class should have extra attributes such as:

// numberOfDoors
// fuelType
// The Motorcycle class should have extra attributes such as:

// engineCapacity
// hasHelmet
// Functions/Methods Required
// Create methods to:

// Input vehicle information from the user.
// Store multiple vehicles in an array.
// Calculate the total rental price based on the number of rental days.
// Display vehicle details.
// Search for a vehicle by ID.
// Check whether a vehicle is expensive or affordable based on its rental price.
// Polymorphism Requirement
// Create a method called:

// displayInfo()
// Override this method in both Car and Motorcycle classes.

// Use a Vehicle reference to call the overridden displayInfo() method.

// Main Method Requirements
// In the main method:

// Ask the user how many vehicles they want to enter.
// Create an array of Vehicle objects.
// Ask the user whether each vehicle is a Car or a Motorcycle.
// Based on the user’s choice, input the correct details for that vehicle.
// Ask the user to enter the number of rental days.
// Calculate and display the rental cost for each vehicle.
// Ask the user to enter a vehicle ID to search.
// Display the information of the searched vehicle if it exists.
// Example User Input
// Enter number of vehicles: 2

// Enter vehicle type:
// 1. Car
// 2. Motorcycle
// Choice: 1

// Enter vehicle ID: 101
// Enter brand: BMW
// Enter model: X5
// Enter rental price per day: 80
// Enter number of doors: 4
// Enter fuel type: Diesel

// Enter rental days: 3
// Enter vehicle ID to search: 101
// Example Output

// Vehicle ID: 101
// Brand: BMW
// Model: X5
// Rental Price Per Day: 80
// Number of Doors: 4
// Fuel Type: Diesel
// Total rental price for 3 days: 240
// This vehicle is expensive.

// NOTE:

// Add input validation so that the user cannot enter negative rental prices, invalid vehicle types, or negative rental days.

import java.util.Scanner;



public class RentalSystem {
    static class Vehicle{
        private int vehicleId;
        private String brand;
        private String model;
        private double rentalPricePerDay;
    
        public Vehicle(int vehicleId,String brand, String model,double rentalPricePerDay){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.model=model;
        this.rentalPricePerDay=rentalPricePerDay; 
        }
        public int getvehicleId(){
            return vehicleId;
        }
        public void setVehicleId(int vehicleId) {
            this.vehicleId = vehicleId;
        }
        public String getbrand(){
            return brand;    
        }
        public void setbrand(String brand){
            this.brand=brand;
        }
        public String getmodel(){
            return model;
        }
        public void setmodel(String model){
            this.model=model;
        }
        public double getrentalPricePerDay(){
            return rentalPricePerDay;
        }
        public void setrentalPricePerDay(double rentalPricePerDay){
            this.rentalPricePerDay=rentalPricePerDay;
        }
        public double calculateRentalPrice(int days) {
        return rentalPricePerDay * days;
        }
        public void checkPrice() {

        if (rentalPricePerDay >70) {
            System.out.println("The vehicle you want to rent is expensive.");
        } else {
            System.out.println("The vehicle you want to rent is affordable.");
        }
    }
    public void displayInfo(){
        System.out.println("Vehicle ID : "+vehicleId);
        System.out.println("BRand : "+brand);
        System.out.println("Model : "+model);
        System.out.println(" Rental price per day : "+ rentalPricePerDay);
        }
    }
    static class Car extends Vehicle{
        private int numberOfDoors;
        private String fueltype;

        public Car(int vehicleId,String brand,String model,double rentalPricePerDay,int numberOfDoors,String fueltype){
        super(vehicleId, brand, model, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
        this.fueltype = fueltype;
        } 
        public int getNumberOfDoors() {
        return numberOfDoors;
        }
        public void setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }
        public String getfueltype(){
            return fueltype;
        }
        public void setfueltype(String fueltype){
            this.fueltype=fueltype;
        }
@Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Number of Doors: " + numberOfDoors);
            System.out.println("Fuel Type: " + fueltype);
        }
        }
    static class Motorcycle extends Vehicle{  
        private int engineCapacity;
        private boolean  hasHelmet;
        
        public Motorcycle(int vehicleId, String brand, String model,double rentalPricePerDay, int engineCapacity,boolean hasHelmet) {
        super(vehicleId, brand, model, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
        this.hasHelmet = hasHelmet;
        }
        public int getengineCapacity() {
        return engineCapacity;
        }
        public void setengineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        }
        public boolean gethasHelmet() {
        return hasHelmet;
        }
        public void sethasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
        }
@Override
        public void displayInfo() {
        super.displayInfo();
            System.out.println("Engine Capacity: " + engineCapacity + " cc");
            System.out.println("Helmet Included: " + hasHelmet);

        }
    }

    static Vehicle searchVehicle(Vehicle vehicles[], int id) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getvehicleId() == id) {
                return vehicles[i];
            }
        }
        return null;
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            System.out.print("Enter number of vehicles: ");
                int n = sc.nextInt();
        Vehicle vehicles[] = new Vehicle[n];
            for (int i = 0; i < n; i++) {
        int choice;
            do {
            System.out.println("\nEnter vehicle type");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.print("Choice: ");
        choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice.");
            }
        } 
        while (choice != 1 && choice != 2);
            System.out.print("Enter vehicle ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter model: ");
            String model = sc.nextLine();
            double price;
            do {
                System.out.print("Enter rental price per day: ");
                price = sc.nextDouble();
                if (price < 0) {
                    System.out.println("Rental price cannot be negative.");
                }
            } while (price < 0);
            if (choice == 1) {
                System.out.print("Enter number of doors: ");
                int doors = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter fuel type: ");
                String fuel = sc.nextLine();
                vehicles[i] = new Car(id, brand, model, price, doors, fuel);
            }
            else {
                System.out.print("Enter engine capacity: ");
                int capacity = sc.nextInt();
                System.out.print("Has helmet? (true/false): ");
                boolean helmet = sc.nextBoolean();
                vehicles[i] = new Motorcycle(id, brand, model, price, capacity, helmet);
            }
        }
        System.out.println("\n==============================");
        for (int i = 0; i < vehicles.length; i++) {
            int days;
            do {
                System.out.print("\nEnter rental days for Vehicle "
                        + vehicles[i].getvehicleId() + ": ");
                days = sc.nextInt();
                if (days < 0) {
                    System.out.println("Rental days cannot be negative.");
                }
            } while (days < 0);
            vehicles[i].displayInfo();
            System.out.println("Total Rental Price: "
                    + vehicles[i].calculateRentalPrice(days));
            vehicles[i].checkPrice();
            System.out.println("-------------------------");
        }
        System.out.print("\nEnter Vehicle ID to search: ");
        int searchId = sc.nextInt();
        Vehicle found = searchVehicle(vehicles, searchId);
        if (found != null) {
            System.out.println("\nVehicle Found");
            found.displayInfo();
        } else {
            System.out.println("Vehicle not found.");
        }
    }




    

}
