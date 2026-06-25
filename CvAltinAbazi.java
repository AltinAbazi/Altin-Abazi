// import java.util.Scanner;

// public class  CvAltinAbazi 
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter your name!");
//         String name = sc.nextLine();
            
//         System.out.println("Enter your surname!");
//         String surname= sc.nextLine();

//         System.out.println("Enter your email adress!");
//         String email =sc.nextLine();
       
//         System.out.println("Enter your birthplace!");
//         String birthplace=sc.nextLine();
//         //Add this logic: First ask the user to select the school level -> Middle School, University and Master. If the user is in high school then ask school name and that's all.
        
//         System.out.println("in what school do you learn??\n\n1=high school\n2=university\n3=master");
//         int school=sc.nextInt();

//         switch(school){
//             case 1:
//                  System.out.println("enter your highschool");
//                  String highschool= sc.nextLine();
//                break;   
        
//          case 2:
//                  System.out.println("enter your university");
//                  String uni = sc.nextLine();
//                break;   
        
//          case 3:
//                  System.out.println("enter your master");
//                  String master= sc.nextLine();
//                 System.out.println("")
//                  break;   
        
        
//         }

        

//         System.out.println("Enter your student id!");
//         int id=sc.nextInt();

//         System.out.println("enter your age");
//         int age=sc.nextInt();

//         System.out.println("Your CV\n\n\n"+"Your name is : " +name+"\nyour surname is :"+surname+"\nyour email is :"+ email+"\nyour age is: "+age+"\nyour is: "+school +"\nyour student id is:"+id+"\nyour birthpalce i s:"+birthplace);

//     }
// }
import java.util.Scanner;

public class CvAltinAbazi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        System.out.println("Please enter your surname:");
        String surname = sc.nextLine();

        System.out.println("Please enter your email address:");
        String email = sc.nextLine();

        System.out.println("Please enter your birthplace:");
        String birthplace = sc.nextLine();

        System.out.println("\nSelect your education level:");
        System.out.println("1 - High School");
        System.out.println("2 - University");
        System.out.println("3 - Master");

        int school = sc.nextInt();
        sc.nextLine();

        String schoolLevel = "";
        String schoolName = "";

        switch (school) {
            case 1:
                schoolLevel = "High School";
                System.out.println("Enter your high school name:");
                schoolName = sc.nextLine();
                break;

            case 2:
                schoolLevel = "University";
                System.out.println("Enter your university name:");
                schoolName = sc.nextLine();
                break;

            case 3:
                schoolLevel = "Master";
                System.out.println("Enter your master program or university name:");
                schoolName = sc.nextLine();
                break;

            default:
                schoolLevel = "Not selected";
                schoolName = "Not provided";
                System.out.println("Invalid education level selected.");
                break;
        }

        System.out.println("Enter your student ID:");
        int id = sc.nextInt();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("\n\n========== YOUR CV ==========");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Age: " + age);
        System.out.println("Education level: " + schoolLevel);
        System.out.println("School/University: " + schoolName);
        System.out.println("Student ID: " + id);

        sc.close();
    }
}
