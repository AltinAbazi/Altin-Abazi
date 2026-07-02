public class Rritje {
     static void rritje(){
     int i;
        for (i = 50; i <= 200; i+=10) {
            if (i==100||i==150){
            continue;}
            System.out.println(i);
        }    
    }
    public static void main(String[] args){
        rritje();
    }
}