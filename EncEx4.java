
import java.util.Scanner;

public class EncEx4 {
    private int code;

    public EncEx4(int startingCode) {
        code = startingCode;
    }

    public void unlock(int attempt) {
        if (attempt == code) {
            System.out.println("Unlocked");
        } else {
            System.out.println("Wrong code");
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int code=sc.nextInt();
        EncEx4 vault = new EncEx4(code);
        

        vault.unlock(1234);
        
    }
}