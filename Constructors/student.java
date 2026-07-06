
package Constructors;

public class   student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;

    }
    void study(){
        System.out.println(this.name +" is studying");
    }
}


