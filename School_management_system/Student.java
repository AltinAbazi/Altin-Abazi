package School_management_system;

class Student extends Person{
        private String studentId;

            public Student(String name,int age,String studentId){
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
