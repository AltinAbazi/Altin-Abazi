package Java_Enum;
// 1. Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
import java.util.Scanner;

public class days {
    public enum DaysOfWeek{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
       } 

       public static void main(String[] args) {
        System.out.println("enter a day! ");
        DaysOfWeek today = DaysOfWeek.MONDAY;
        System.out.println("today is "+today);
       }
    }
