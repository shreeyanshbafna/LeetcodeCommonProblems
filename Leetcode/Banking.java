package javaforgood;

import java.util.HashMap;
import java.util.Scanner;

class Account {
	private String name;

	public String getName() {
		return name;
	}

	public Account(String name, int accountNo) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = 0.0;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int accountNo;
	private double balance;
	private String address;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("withdraw" + balance);
		} else {
			System.out.println("insufficient");
		}
	}

	public void Deposit(double amount) {
		balance += amount;
		System.out.println("deposit" + balance);
	}

	public void showBala(double amount) {
		System.out.println("currentbalance" + amount);
	}

}

public class Banking {

	private static HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
	private static Scanner scanner = new Scanner(System.in);
	private static int nextAccount = 1000001;

	public static void main(String[] args) {
		System.out.println("hi");
		int option;
		do {
			option = scanner.nextInt();
			switch (option) {
			case 1: {
				createaccount();
			}
			case 2: {
				Depositamount();
			}
			case 3: {
				wthdrawamount();
			}
			case 4: {
				Showbal();
			}
				;

			}
		} while (option != 100);

	}

	private static void Showbal() {
		int account = scanner.nextInt();
		Account acc = accountMap.get(account);

		if (acc != null) {
			acc.showBala(account);

		}
	}

	private static void wthdrawamount() {
		int account = scanner.nextInt();

		double amount = scanner.nextDouble();
		Account acc = accountMap.get(account);
		if (acc != null) {
			acc.withdraw(amount);
		}
	}

	private static void Depositamount() {
		System.out.println("enter amounr");
		double amount = scanner.nextDouble();
		Account acc = getAccount();
		if (acc != null) {
			acc.Deposit(amount);
		}
	}

	private static Account getAccount() {
		int account = scanner.nextInt();
		Account acc = accountMap.get(account);
		if (acc == null) {
			System.out.println("Not found");
		}
		return acc;
	}

	private static void createaccount() {
		System.out.println("wnter ur name");
		scanner.nextLine();
		String name = scanner.nextLine();
		Account acc = new Account(name, nextAccount++);
		accountMap.put(acc.getAccountNo(), acc);
		System.out.println(acc.getAccountNo() + "created");
	}

}
