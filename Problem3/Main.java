package Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountNumber = sc.nextLine();
        String accountHolderName = sc.nextLine();
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);

        System.out.println(account.getBalance());
        sc.close();
    }
}
