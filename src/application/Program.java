package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		Locale locale = new Locale("portuguese", "pt-BR");

		Account account = new Account();

		System.out.println("Enter account number: ");
		account.setAccountNumber(sc.nextInt());
		System.out.println("Linguagem: " + locale);

		System.out.println("Enter account holder: ");
		account.setAccountHolder(scString.nextLine());

		System.out.print("Is there a initial deposit (y/n)?");
		account.setInitialDeposit(sc.next().charAt(0));

		if (account.getInitialDeposit() == 'y') {
			System.out.print(account.getInitialDeposit());
			System.out.print("Enter initial deposit value: ");
			account.setAccountBalance(sc.nextDouble());
			System.out.println(account.getAccountData());
		} else {
			System.out.println();
			System.out.println(account.getAccountData());
		}

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
