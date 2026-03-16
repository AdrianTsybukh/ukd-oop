import java.util.ArrayList;

public class Bank {
    private final ArrayList<BankAccount> accounts;

    public Bank(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void createAccount(String userName, int userAge, long startingBalance) {
        this.accounts.add(new BankAccount(startingBalance, userName, userAge));
    }

    public BankAccount getAccount(long cardNumber) {
        return accounts.stream()
                .filter(account -> account.getCardNumber() == cardNumber)
                .findFirst()
                .orElseThrow();
    }

    public void printAccounts() {
        accounts
                .forEach(BankAccount::printInfo);
    }
    public void transfer(BankAccount src, BankAccount dst, long amount) {
        if (amount > 0 && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dst.setBalance(dst.getBalance() + amount);
            System.out.printf("You transferred $%d to %s\n", amount, dst.getUserName());
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }
}
