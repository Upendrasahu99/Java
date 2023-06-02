package topics._13_exception.throws_.example.example2;

public class Example2 {
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    private int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("InsufficientBalanceException");
        }
        balance = balance - amount;
        System.out.println("Amount Withdraw: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}
 class RunProgram{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(6000);
        try{
            account.withdraw(4000);
            account.withdraw(6000);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e);
        }
    }
}