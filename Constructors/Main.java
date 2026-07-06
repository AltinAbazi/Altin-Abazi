package Constructors;

public class Main {
    public static void main(String[] args) {
        student student1 =new student("altin",20,6.9);
        student1.study();
         
        User user1 =new User("altin");
        User user2 =new User("jetmir","jetmirabazi@gmail.com");
        User user3 =new User("afrim","afrimabazi@gmail.com",30);



        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);


        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
