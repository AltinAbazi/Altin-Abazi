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

    public void setOwner(String owner){
        System.out.println(owner);
    }

    public double getBalance() {
        return balance;
    }

        public void setBalance(double balance) {
               System.out.println(balance);
        }
    

    // public void deposit(double amount) {
    //     if (amount > 0) {
    //         balance += amount;
    //     }
    // }



    public static void main(String[] args) {
        Encapsulation account = new Encapsulation("Suad",900);

        System.out.println(account.getOwner());
        System.out.println(account.getBalance());
        account.setOwner("Altin");

        // account.deposit(200);
        // System.out.println(account.getBalance());

        account.setBalance(100000);
        // System.out.println(account.getBalance());
    }
}