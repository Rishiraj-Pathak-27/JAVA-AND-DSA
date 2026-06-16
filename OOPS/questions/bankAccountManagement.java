// Develop a Bank Account Management System to manage customer bank accounts securely.
// Create an Account class that follows the principle of encapsulation by keeping account details and balance private.

// The system should allow customers to perform basic banking operations such as depositing money, withdrawing money, and checking their account balance.
// It should also identify accounts whose balance falls below ₹1000 and generate an account summary report.
import java.util.Scanner;

class Account {

    private long accNum;
    private String accHolder;
    private String accType;
    private double balance;

    // setters
    Account(long accNum, String accHolder, String accType, double balance) {
        this.accNum = accNum;
        this.accHolder = accHolder;
        this.accType = accType;
        this.balance = balance;
    }

    long getNum() {
        return this.accNum;
    }

    String getAccHolder() {
        return this.accHolder;
    }

    String getAccType() {
        return this.accType;
    }

    // deposit function
    double accDeposit(double amt) {
        balance += amt;
        return balance;
    }

    // withdrawal function
    double accWithdrawal(double amt) {
        if (balance > 0 && balance >= amt) {
            balance -= amt;
        }
        return balance;
    }

    double getBalance() {
        return this.balance;
    }
}

class bankOp extends Account {

    bankOp(long accNum, String accHolder, String accType, double balance) {
        super(accNum, accHolder, accType, balance);
    }

    void summary() {
        System.out.println("Account Number: " + getNum());
        System.out.println("Account Holder Name: " + getAccHolder());
        System.out.println("Account Type: " + getAccType());
        System.out.println("Account Initial Balance: " + getBalance());
    }

}

public class bankAccountManagement {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total number of bank accounts");
        int n = ip.nextInt();
        ip.nextLine();

        bankOp[] bo = new bankOp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter account number: ");
            long accNum = ip.nextLong();
            ip.nextLine();

            System.out.println("Enter account holder name: ");
            String accHolder = ip.nextLine();

            System.out.println("Enter account type: ");
            String accType = ip.nextLine();

            System.out.println("Enter initial balance: ");
            double balance = ip.nextDouble();
            ip.nextLine();

            bo[i] = new bankOp(accNum, accHolder, accType, balance);
        }

        System.out.println("----------Bank Account Summary-----------");
        for (int i = 0; i < bo.length; i++) {
            bo[i].summary();
        }

        // available accounts
        System.out.println();
        System.out.println("Available Bank Accounts with it's Holders: ");
        for (int i = 0; i < bo.length; i++) {
            System.out.println((i + 1) + ". " + bo[i].getAccHolder());
        }

        System.out.println();

        for (int i = 0; i < bo.length; i++) {
            System.out.println("Enter the Serial number: ");
            int sr = ip.nextInt();
            ip.nextLine();

            bankOp selected = bo[sr - 1];

            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance Enquiry");

            int choice = ip.nextInt();
            ip.nextLine();

            if (choice == 1) {
                System.out.println("Enter the amount to be deposited: ");
                double amount = ip.nextDouble();
                ip.nextLine();

                System.out.println("Updated balance = " + selected.accDeposit(amount));
            }

            if (choice == 2) {
                System.out.println("Enter the amount to be withdrawal: ");
                double amount = ip.nextDouble();
                ip.nextLine();

                System.out.println("Updated balance = " + selected.accWithdrawal(amount));
            }
        
            if (choice == 3) {
                System.out.println("Your Current Balance = " + selected.getBalance());
            }
        }
    }
}
