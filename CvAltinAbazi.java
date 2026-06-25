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
        //Add this logic: First ask the user to select the school level -> Middle School, University and Master. If the user is in high school then ask school name and that's all.
        
        System.out.println("in what school do you learn??\n\n1=high school\n2=university\n3=master");
        int school=sc.nextInt();

        switch(school){
            case 1:
                 System.out.println("enter your highschool");
                 String highschool= sc.nextLine();
               break;   
        
         case 2:
                 System.out.println("enter your university");
                 String uni = sc.nextLine();
               break;   
        
         case 3:
                 System.out.println("enter your master");
                 String master= sc.nextLine();
                System.out.println("")
                 break;   
        
        
        }

        

        System.out.println("Enter your student id!");
        int id=sc.nextInt();

        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println("Your CV\n\n\n"+"Your name is : " +name+"\nyour surname is :"+surname+"\nyour email is :"+ email+"\nyour age is: "+age+"\nyour is: "+school +"\nyour student id is:"+id+"\nyour birthpalce i s:"+birthplace);

    }
}
//    System.out.println("Enter your university:");
//         String uni= sc.nextLine();

//         System.out.println("Enter your department!");
//         String department= sc.nextLine();
