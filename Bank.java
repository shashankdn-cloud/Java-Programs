public class Bank {
    void deposit(double cash) {
        System.out.println("Deposited cash: ₹" + cash);
    }

    void deposit(String chequeNumber, double amount) {
        System.out.println("Deposited cheque " + chequeNumber + " of ₹" + amount);
    }

    void depositUPI(String upiId, double amount) {
        System.out.println("Deposited ₹" + amount + " via UPI ID: " + upiId);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(1000.0);
        b.deposit("CHQ12345", 2500.0);
        b.depositUPI("user@upi", 1500.0);
    }
}