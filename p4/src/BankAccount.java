import java.util.Random;

public class BankAccount {
    private long cardNumber;
    private long balance;
    private String userName;
    private int userAge;

    public BankAccount(long balance, String userName, int userAge) {
        Random rand = new Random();
        this.balance = balance;
        this.userName = userName;
        this.userAge = userAge;
        this.cardNumber = rand.nextLong(1_000_000_000_000_000L, 9_999_999_999_999_999L) + 1;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Deposited $%d\n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(long amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.printf("You have withdrawn $%d from your card\n", amount);
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void printInfo() {
        System.out.printf("User name: %s. Card number: %d. Balance: $%d\n", this.getUserName(), this.getCardNumber(), this.getBalance());
    }
}
