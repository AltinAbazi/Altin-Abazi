

public class Printimi {
    static void Ascending(){
     int i;
        for (i = 1; i <= 50; i+=5) {
   System.out.println(i);
   
}

    }
    static void  Descending(){
      int i;
for(i=50;i>=1;i-=5){
    System.out.println(i);
    
}
    }
public static void main(String[] args) {
 
    System.out.println("printimi i nr prej 1-50 ");
Ascending();
System.out.println("---------------------------------------");
System.out.println("printimi i nr prej 50-1 ");
Descending();

}
}