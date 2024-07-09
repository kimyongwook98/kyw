package ch11.tryCatch5;

import ch11.exception.InsufficientException;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
