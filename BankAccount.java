public class BankAccount {

    private double balance;
    private String accountHolder;

    //Constructor
    public BankAccount(String accountHolder, double balance){
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

        //Method to deposit money
        public void deposit(double amount) {
            if (balance > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else{
                System.out.println("Deposited balance must be positive.");
            }
        }
        

        //Method to withdraw money
        public void withdraw(double amount){
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance){
            System.out.println("Insufficient funds for withdrawal.");
        }else{
            System.out.println("withdrawal amount must be positive ");
        }
    }


//Method to display current balance
public void displayBalance() {
    System.out.println("Current balance: $" + balance );
        }
    }  

    

