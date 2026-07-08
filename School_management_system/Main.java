package School_management_system;

class Main{
        public static void main(String[] args) {
            Person[] directory={
                new Student("Altin",20,"133919"),
                new Teacher("Suad",30,"Object Oriented Programming"),
                new Student("Veton",19,"133879"),
                new Teacher("Imer",30,"Structural Programming"),
            };
                for(Person person :directory){
                person.introduce();
            }
        }
    }
