package Rental_system;

import java.util.Scanner;
public class main {

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
    static Vehicle searchVehicle(Vehicle vehicles[], int id) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getvehicleId() == id) {
                return vehicles[i];
            }
        }
        return null;
    }

}