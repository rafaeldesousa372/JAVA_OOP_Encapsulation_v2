package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		Account account;

		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.println("Enter account holder: ");
		String accountHolder = scString.nextLine();

		System.out.print("Is there a initial deposit (y/n)?");
		char initialDeposit = sc.next().charAt(0);

		if (initialDeposit == 'y') {
			System.out.print("\n" + "Enter initial deposit value: ");
			double accountBalance = sc.nextDouble();
			account = new Account(accountHolder, accountBalance, accountNumber);
			account.setAccountBalance(accountBalance);
		} else {
			account = new Account(accountHolder, accountNumber);
		}

		System.out.println(account.getAccountData());
		
		System.out.println("Enter a deposit value: ");
		account.setAccountIncome(sc.nextDouble());

		System.out.println("Updated account balance: ");
		System.out.println(account.getAccountData());

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		account.setAccountWithdraw(sc.nextDouble());
		System.out.println(account.getAccountData());

		scString.close();
		sc.close();

	}
}
