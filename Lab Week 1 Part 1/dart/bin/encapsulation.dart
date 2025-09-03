class BankAccount {
  double _balance = 0;

  double get balance => _balance;

  set balance(double value) {
    if (value < 0) throw ArgumentError('Balance cannot be negative');
    _balance = value;
  }

  void deposit(double amount) {
    if (amount <= 0) throw ArgumentError('Amount must be > 0');
    _balance += amount;
  }

  void withdraw(double amount) {
    if (amount <= 0 || amount > _balance) {
      throw ArgumentError('Invalid withdraw amount');
    }
    _balance -= amount;
  }
}

void run() {
  var acc = BankAccount();
  acc.deposit(100);
  acc.withdraw(40);
  print("Balance = ${acc.balance}"); //mirip Java System.out.println
}
