import java.util.Scanner;

class Account {
String name;
String acc_num;
double balance;
String acc_type;

   
    public Account(String name, String acc_num, double balance, String acc_type) {
        this.name = name;
        this.acc_num = acc_num;
        this.balance = balance;
        this.acc_type = acc_type;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("The balance of the account: " + balance);
    }


    public void display() {
        System.out.println("Current balance: " + balance);
    }
}


class SavAcc extends Account {
    public SavAcc(String name, String acc_num, double balance) {
        super(name, acc_num, balance, "Saving");
    }

    public void calInterest() {
        double interestRate = 0.05; 
        double interest = interestRate * balance;
        balance += interest;
        System.out.println("Interest applied, current balance: " + balance);
    }

 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful of " + amount + ", current balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}


class CurAcc extends Account {
    int minBalance = 500; 
    int penalty = 50; // Penalty fee

    public CurAcc(String name, String acc_num, double balance) {
        super(name, acc_num, balance, "Current");
    }

    // Method to withdraw money with penalty logic
    public void withdraw(double amount) {
        if (balance - amount < minBalance) {
            balance -= (amount + penalty); 
            System.out.println("Penalty applied, current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful of " + amount + ", current balance: " + balance);
        }
    }
}


class bank1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
      
        SavAcc sav = new SavAcc("Raj", "64BE404", 2000);
       
        CurAcc cur = new CurAcc("Dhanu", "64BE489", 2050);
        
        System.out.println("Raj's account:");
        sav.deposit(1000.0);
        sav.display();
        sav.calInterest();
        sav.withdraw(100.0);
        sav.display();

        System.out.println("\nDhanu's account:");
        cur.deposit(2000.0); 
        cur.display();
        cur.withdraw(1005.0);
        cur.display();
        
        scan.close();
    }
}
