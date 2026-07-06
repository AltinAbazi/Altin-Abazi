// Private field: isOn (boolean)
// Constructor sets initial state (on/off)
// Method turnOn()
// Method turnOff()
// Method status() — prints "Light is ON" or "Light is OFF"
// In Main, create a light, turn it on, print status, turn it off, print status again

import java.util.Scanner;

public class EncEx2 {
    private boolean isOn;

public EncEx2(boolean light) {
        isOn =light;

    }
public void turnOn(){
    isOn=true;
    }
public void turnOff(){
    isOn=false;

}    

public void check(){
    if(isOn){
        System.out.println("the light is on");
    }else{
        System.out.println("the light is off");

    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean add=sc.nextBoolean();
    EncEx2 light=new EncEx2(add);
    light.check();
    light.turnOff();  
    light.check();  
}

}
