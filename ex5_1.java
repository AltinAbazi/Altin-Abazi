import java.util.Scanner;

 public class ex5_1 {
public static void main (String[] args){
   System.out.print("cfare doni te pini 1=kafe,2=kola,3=chaj?");
    Scanner sc = new Scanner(System.in);

    int porosia = sc.nextInt();
    switch(porosia){
    case 1:
        System.out.println("prosia juaj eshte kafe.");
        break;
    case 2:
        System.out.println("prosia juaj eshte kola.");
        break;
    case 3:
        System.out.println("prosia juaj eshte chaj.");
        break;

}}}






