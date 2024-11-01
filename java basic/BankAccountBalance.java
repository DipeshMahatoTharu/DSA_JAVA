// Bank Account Balance
// For a bank account, you'll need to:

// Create a BankAccount class with a balance variable to store the current balance.
// Implement methods:
// deposit(double amount): This method adds the specified amount to the balance.
// withdraw(double amount): This method subtracts the specified amount from the balance,
//  but only if there’s enough money (balance should not go below zero).
// In main, create an instance of BankAccount, perform deposits and withdrawals, and print the final balance.
class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    
    }

    public void deposit(double amount ){
        if(amount >0 ){
            balance +=amount;
            System.out.println("Balance deposite :" + amount);
        }else{
            System.out.println("Invalid input ");

        }
    }

        public void withdraw(double amount){
            if( amount >0 && amount <=balance){
                balance -=amount;


                System.out.println("withdrew : "+ amount );

            }else{
                System.out.println("invalid or infinitent balance in amount .");

            }    
        }   
    
                                                                                                                                                                                                                                                                                                                                                              

    public double getBalance() {
        return balance;
    }
}

public class BankAccountBalance {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Start with an initial balance
        account.deposit(500);
        account.withdraw(200);
        

        System.out.println("Final balance: " + account.getBalance());
    }
}
