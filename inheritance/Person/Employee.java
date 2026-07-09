package inheritance.Person;

class Employee extends person{
        private int EmployeeId; 
        private String jobtitle;
        public Employee(String Firstname,String Lastname,int EmployeeId,String jobtitle){
            super(Firstname, Lastname);
            this.EmployeeId=EmployeeId;
            this.jobtitle=jobtitle;
        }
        public int getEmployeeId(){
            return EmployeeId;
        }
        public String getjobtitle(){
            return jobtitle;
        }
        @Override
            public String getLastname(){
                return super.getLastname()+", "+jobtitle;
            }    
    
        }
