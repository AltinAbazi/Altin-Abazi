/*here we created a method exercise to input two values and the system
will automatically calculate the numbers*/
import java.util.Scanner;



public class methodExercises {

    
   
   
    static int methodPlus(int x,int y){
        return x+y;             
           
    }
    static int methodMinus (int x,int y){
        return x-y;     
    }
    static int methodProdhimi (int x,int y){
        return x*y;     
    }
    static double methodPjestimi (double x,double y){
        return x/y;     
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
            int x =sc.nextInt();
            int y=sc.nextInt();
        System.out.println("mbledhja  eshte  = " + methodPlus(x,y));
        System.out.println("Zbirtja eshte  = " +methodMinus(x,y));
        System.out.println("Prodhimi eshte   = " +methodProdhimi(x,y));
        System.out.println("Ndryshimi eshte   = " +methodPjestimi(x,y));
        
    }
}

