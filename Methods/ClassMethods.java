package Methods;
public class ClassMethods {
    public void fullThrottle(){
            System.out.println("THe car is going as fast as it can!");

    }
    public void topSpeed(int maxSpeed){
        System.out.println("its going : "+maxSpeed);
    }
    public static void main(String[] args) {
     ClassMethods myCar=new ClassMethods();
     myCar.fullThrottle();
     myCar.topSpeed(260);

    }
}