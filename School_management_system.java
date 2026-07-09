// Create a Java program for a simple School Management System using encapsulation, inheritance, and polymorphism.
// Requirements:
// Create a base class called Person with private attributes:
// name
// age
// Use encapsulation by providing constructors, getters, and setters.
// Create two classes that inherit from Person:
// -     Student
//         -       additional private attribute: studentId

// - Teacher

//         -             additional private attribute: subject

// In the Person class, create a method:
// public void introduce()
// This method should print basic person information.
// Override the introduce() method in both Student and Teacher classes:
// A student should display their name, age, and student ID.
// A teacher should display their name, age, and subject.
// In the main method:
// Create at least two students and two teachers.
// Store all objects in a Person[] array.
// Use a loop to call introduce() for every object.
// This should demonstrate polymorphism, because the same introduce() method behaves differently depending on whether the object is a Student or Teacher.
public class School_management_system {
        private String name;
        private int age;

            public School_management_system (String name, int age){
                this.name=name;
                this.age= age;
                }
            public String getName(){
                return name;
                }
            public void setName(String name){
                this.name=name;
                }
            public int getAge(){
                return age;
                }
            public void setAge(int age){
                this.age=age;
                }
            public void introduce(){
            System.out.println("name "+name+"age "+age); 
                }
            }
    class student extends School_management_system{
        private String studentId;

            public student(String name,int age,String studentId){
                super(name,age);
                this.studentId=studentId;
            }
            public String getstudentId(){
                return studentId;
            }
            public void setstudentId(String studentId){
                this.studentId=studentId;
            }
    @Override
            public void introduce(){
            System.out.println("Student's name "+getName()+"\nsSudent's age "+getAge()+"\nStudent's Id "+getstudentId());
            }
        }    
    class teacher extends School_management_system{
        private String subject;
            
            public teacher(String name,int age,String subject){
                super(name,age);
                this.subject=subject;
            }
            public String getsubject(){
                return subject;
            }
            public void setsubject(String subject){
                this.subject=subject;
            }
    @Override
            public void introduce(){
                System.out.println("\nTeacher's name "+getName()+"\nTeacher's age "+getAge()+"\nTeacher's subject "+getsubject());
            }        
        }
    class main{
        public static void main(String[] args) {
            School_management_system[] directory={
                new student("Altin",20,"133919"),
                new teacher("Suad",30,"Object Oriented Programming"),
                new student("Veton",19,"133879"),
                new teacher("Imer",30,"Structural Programming"),
            };
                for(int i =0 ;i<directory.length;i++){
                   School_management_system person= directory[i];
                person.introduce();
            }
        }
    }

    
    
    
    
    
    
    
