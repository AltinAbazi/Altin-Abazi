package Rental_system;


    class Motorcycle extends Vehicle{  
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

    

