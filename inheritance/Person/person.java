package inheritance.Person;

public class person {
    private String Firstname;
    private String Lastname;

    public person(String Firstname,String Lastname){
        this.Firstname=Firstname;
        this.Lastname=Lastname; 
    }
        public String getFirstname(){
            return Firstname;

        }
        public String getLastname(){
            return Lastname;
        }
    }