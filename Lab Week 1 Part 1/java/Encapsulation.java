public class Encapsulation {
    static class BankAccount {
        private double balance = 0;

        public double getBalance() { return balance; }

        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) balance -= amount;
        }
    }

    public static void run() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        acc.withdraw(40);
        System.out.println("Balance: " + acc.getBalance());
    }
}
