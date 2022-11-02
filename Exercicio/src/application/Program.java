package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("With Draw Limit: ");
			Double withdrawlimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawlimit);
			
			System.out.println("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			try {
				account.withdraw(amount);
				System.out.printf("Novo saldo: %.2f%n", account.getBalance());
			}
			catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
			
			sc.close();
			
			
		
		
		
		
		sc.close();
	}
}
