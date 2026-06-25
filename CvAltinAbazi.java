import java.util.Scanner;

public class  CvAltinAbazi 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = sc.nextLine();
            
        System.out.println("Enter your surname!");
        String surname= sc.nextLine();

        System.out.println("Enter your email adress!");
        String email =sc.nextLine();

        
       
        System.out.println("Enter your birthplace!");
        String birthplace=sc.nextLine();

        System.out.println("Enter your university:");
        String uni= sc.nextLine();

        System.out.println("Enter your department!");
        String department= sc.nextLine();


        System.out.println("Enter your student id!");
        int id=sc.nextInt();

        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println("Your CV\n\n\n"+"Your name is : " +name+"\nyour surname is :"+surname+"\nyour email is :"+ email+"\nyour age is: "+age+"\nyour university is: "+uni+"\nyour department is :"+department+"\nyour student id is:"+id+"\nyour birthpalce i s:"+birthplace);

    }
}