package inheritance;
// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//  Create a subclass called SavingsAccount that overrides the withdraw() method to prevent
//  withdrawals if the account balance falls below one hundred.


public class BankAccout {
    private String accountNumber;
    private double balance;

    public BankAccout(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double ammount){
        balance+=ammount;
    }
    public void withdraw(double ammount){
        if(balance>ammount){
            balance-=ammount;
        }else{
            System.out.println("not enough money!!!");
        }
    }
    public double getBalance(){
        return balance;
        }
}
public SavingsAccount extends BankAccount{
    public SavingsAccount(double accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    public void withdraw(double ammount){
        if(getBalance() -ammount <100){
        System.out.println(
            
        );
        }
    }
}
