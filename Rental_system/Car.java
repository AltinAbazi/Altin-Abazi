package Rental_system;

class Car extends Vehicle{
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