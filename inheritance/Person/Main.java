package inheritance.Person;

 class Main{
        public static void main(String[] args) {
        
        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(employee1.getFirstname() + " " + employee1.getLastname() + " (" + employee1.getEmployeeId() + ")");
        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
        System.out.println(employee2.getFirstname() + " " + employee2.getLastname() + " (" + employee2.getEmployeeId() + ")");

        }
    }