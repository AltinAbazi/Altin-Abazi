package School_management_system;

class Teacher extends Person{
        private String subject;
            
            public Teacher(String name,int age,String subject){
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
