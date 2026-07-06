// Private field: hp (int), starting at 100
// Constructor sets starting hp
// Method takeDamage(int amount) — subtracts hp, but never lets it go below 0
// Method heal(int amount) — adds hp, but never lets it exceed 100
// Method showStatus() — prints current hp
// In Main, create a character, damage it a few times, heal it, print status after each action

import java.util.Scanner;

public class EncEx3 {
    private int hp;
    public EncEx3(int startingHp) {
    hp = startingHp;
}
public void takeDamage(int amount) {
    hp -= amount;
    if (hp < 0) {
        hp = 0;
    }
}
public void heal(int amount) {
    hp += amount;
    if (hp > 100) {
        hp =0;
    }
}
public void showStatus() {
    if(hp==0){
        System.out.println("you are dead");
    }else{
    System.out.println("HP: " + hp);
}}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int hp=sc.nextInt();
    EncEx3 health =new EncEx3(hp);
        health.takeDamage(50);
        health.heal(40);
        health.showStatus();
        
        health.takeDamage(40);
        health.heal(0);
        health.showStatus();


    }
}
    

