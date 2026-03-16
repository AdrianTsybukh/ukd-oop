import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(new ArrayList<>());
        bank.createAccount("Vova", 10, 1000);
        bank.createAccount("Dima", 12, 1000);
        bank.createAccount("Adrian", 17, 1000);
        bank.createAccount("Stus", 98, 1000);
        bank.printAccounts();
        Scanner sc = new Scanner(System.in);
        try {
            bank.getAccount(sc.nextLong()).printInfo();
        } catch (Exception e) {
            System.out.println("No such a card.");
        }
        bank.transfer(bank.getAccount(sc.nextLong()), bank.getAccount(sc.nextLong()), 500);

        bank.printAccounts();
    }
}