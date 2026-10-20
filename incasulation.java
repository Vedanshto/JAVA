import java.util.*;

class BankAccount {
    private String AccoutnNumber;
    private String HolderName;
    private double Balance;
    private int pin;

    BankAccount(String a, String b, double c, int d) {
        AccoutnNumber = a;
        HolderName = b;
        Balance = c;
        pin = d;

        System.err.println("Accoint Created !");

         System.err.println();
        System.err.println("--------------------------------------------------------------------------------------------");


    }

    public void Deposit(double Amount) {
        Balance += Amount;

        System.err.println("Amount Added Succesfully :");
        System.err.println("Balance :" + Balance);
        System.err.println();
        System.err.println(
                "--------------------------------------------------------------------------------------------");
    }

    public void withdraw(double amount, int p) {
        if (pin == p && Balance >= amount) {
            Balance -= amount;

            System.err.println("Withdrawl Succesfully Rs :" + amount + " |  Balance : " + Balance);
        }

        else if (amount > Balance)
            System.err.println(" Not enough Balance");
        else
            System.err.println("Wrong Pin !");

        System.err.println();
        System.err.println(
                "--------------------------------------------------------------------------------------------");

    }

    public void getBalance(int p) {
        if (p == pin)
            System.err.println("Balance : " + Balance);
        else
            System.err.println("Wrong Pin");

        System.err.println();
        System.err.println(
                "--------------------------------------------------------------------------------------------");

    }

    public void changePin(int oldPin, int newPin) {
        if (pin == oldPin) {
            pin = newPin;
            System.err.println("Pin Change Succesfully");

        } else
            System.err.println("Wrong Pin");

        System.err.println();
        System.err.println(
                "--------------------------------------------------------------------------------------------");

    }

    public void getAccountNumber() {
        System.err.println(AccoutnNumber);
        System.err.println();
        System.err.println(
                "--------------------------------------------------------------------------------------------");

    }

    public void getHolderName() {
        System.err.println(HolderName);
        System.err.println();
        System.err.println(
                "--------------------------------------------------------------------------------------------");

    }

}

public class incasulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");

        // creat a account

        BankAccount obj1 = new BankAccount("90101", "Vedansh Tomar", 10.0, 248001);

        obj1.Deposit(101010);
        obj1.withdraw(1011.0, 248001);
        
        obj1.changePin(248001, 1);
        
        obj1.withdraw(10101.0, 248001);

        obj1.getAccountNumber();
        obj1.getHolderName();

        sc.close();

    }

}