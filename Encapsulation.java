public class Encapsulation {
    private String owner;
    private double balance;

    Encapsulation(String o, double b) {
        owner = o;
        balance = b;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Encapsulation account = new Encapsulation("Altin", 500);

        System.out.println(account.getOwner());
        System.out.println(account.getBalance());

        account.deposit(200);
        System.out.println(account.getBalance());

        account.setBalance(-100);
        System.out.println(account.getBalance());
    }
}