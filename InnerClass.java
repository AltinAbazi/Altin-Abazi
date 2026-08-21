public class InnerClass {
    String x ="altin ";
    public class inside{
        String y ="abazi";
    }
    public static void main(String[] args) {
        InnerClass out = new InnerClass();
        InnerClass.inside in= out.new inside();
        System.out.println(out.x + in.y);
        
    }
}