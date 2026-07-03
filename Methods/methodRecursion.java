package Methods;
import java.util.Scanner;
public class methodRecursion {
     static int sum(int k){
        if(k>0){
            return k+sum(k-1);

        }else {
        return 0;
    }
}


public static void main(String[] args ){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    System.out.println(sum(k));
}
}