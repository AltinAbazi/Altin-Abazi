import java.util.Scanner;

public class methodRecursion2 {
   static void countdown(int  n) {
    if (n > 0) {
      System.out.print(n + " ");
      countdown(n - 1);
    }
}

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    countdown(n);
 }
}

