package Jan24;

public class Bank {
    double balance;

    double getBalance(){
        return balance;
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    double withDraw(double amount){
        if(amount > balance){
            throw new Insufficient("Insufficient funds");
        }
        balance = balance - amount;
        return balance;
    }

    double deposit(double amount){
        double dep = balance + amount;
        return dep;
    }
}
