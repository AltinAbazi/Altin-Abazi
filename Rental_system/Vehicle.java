package Rental_system;
    
class Vehicle{
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