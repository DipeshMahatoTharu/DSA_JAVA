// Write a program to model a simple bank account system.
// Instructions:
// Create a class BankAccount with instance variables balance.
// Add methods deposit(double amount) and withdraw(double amount) to add or subtract money from the account.
// In the main method, create an instance of BankAccount, perform a few deposits and withdrawals, and print the final balance.
// 10. Student Grade Calculator
// Description: Write a program that calculates the average grade of a student.
// Instructions:
// Create a class Student.
// Add an array to hold the grades of a student and a method calculateAverage() to return the average of the grades.
// In the main method, create an instance of Student, set a few grades, and print the average.


// contructor 
class BankAccount{
    private double balance;

    // For public access 
    public BankAccount(double initanceBalance){
        this.balance=initanceBalance;
    }

    // Method to deposite the money in your account 
    public void deposit(double amount){
        if(amount >0){
            balance +=amount;
            System.out.println("Deposited"+ amount);

        }else{
            System.out.println("invalid deposited number");
        }
// Method to withdraw money form account
        public void withdraw(double amount){
            if(amount >0 && amount<=balance){
                
            }
        }


    }



}


public class BankAccountBalance {
    public static void main(String[] args) {
        
    }
}
