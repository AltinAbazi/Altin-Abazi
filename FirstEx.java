import java.util.Scanner;
public class FirstEx {
     public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
System.out.println("enter the first value");
int first= sc.nextInt();


      Scanner sc1=new Scanner(System.in);
System.out.println("enter the second value");
int second= sc1.nextInt();

int plus = first + second;
int minus = first - second;
int prodhim = first * second;
int pjestim = first / second;
int division = first % second;

System.out.println(first +"+"+ second +"="+ plus);
System.out.println(first +"-"+ second +"="+ minus);
System.out.println(first +"*"+ second +"="+ prodhim);
System.out.println(first +"/"+ second +"="+ pjestim);
System.out.println(first +"%"+ second +"="+ division); 


    }
}
