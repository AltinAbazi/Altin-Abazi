package School_management_system;

class Main{
        public static void main(String[] args) {
            Person[] directory={
                new Student("Altin",20,"133919"),
                new Teacher("Suad",30,"Object Oriented Programming"),
                new Student("Veton",19,"133879"),
                new Teacher("Imer",30,"Structural Programming"),
            };
                directory[0].introduce();
                directory[1].introduce();
                directory[2].introduce();
                directory[3].introduce();
        }
    }