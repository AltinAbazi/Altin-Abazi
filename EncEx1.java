// Constructor sets starting balance
// Method addMoney(double amount) — adds only if amount > 0
// Method spendMoney(double amount) — subtracts only if enough balance exists
// Method showBalance() — prints the current balance (no getter, just prints it directly)
// In Main, create a wallet, add money, try to spend more than available (should be blocked), then show balance
public class EncEx1 {
    private double balance;

    EncEx1(double startingBalance) {
        balance = startingBalance;
    }
    
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void spendMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }



    public static void main(String[] args) {
        EncEx1 myWallet = new EncEx1(100);

        myWallet.showBalance();

        myWallet.addMoney(50);
        myWallet.showBalance();

        myWallet.spendMoney(300);
        myWallet.showBalance();

        myWallet.spendMoney(70);
        myWallet.showBalance();
    }
}