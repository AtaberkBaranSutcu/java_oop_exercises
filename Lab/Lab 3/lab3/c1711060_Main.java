package newproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int menu, value;

		String data1, data2;

		boolean key = true;

		Scanner input = new Scanner(System.in);

		System.out.print("Interest value for SavingAccount 1: ");
		SavingAccount s1 = new SavingAccount(input.nextDouble());

		System.out.print("Deposit for SavingAccount 1: ");
		s1.setBalance(input.nextDouble());

		System.out.print("Interest value for SavingAccount 2: ");
		SavingAccount s2 = new SavingAccount(input.nextDouble());

		System.out.print("Enter initial balance for CheckingAccount: ");
		CheckingAccount c1 = new CheckingAccount(input.nextDouble());

		while (key) {
			System.out.println("");
			System.out.println("Choose operation: ");
			System.out.print("1-deposit 2-withdraw 3-transfer 4-exit: ");
			menu = input.nextInt();
			System.out.println("");

			if (menu == 1) {
				input.nextLine();
				System.out.print("Enter the Account type and number to deposit money from: ");
				data1 = input.nextLine();
				System.out.print("Enter amount of money to deposit: ");
				value = input.nextInt();

				if (data1.equals("s1")) {
					s1.deposit(value);
				} else if (data1.equals("s2")) {
					s2.deposit(value);
				} else if (data1.equals("c1")) {
					c1.deposit(value);
				}
			} else if (menu == 2) {
				input.nextLine();
				System.out.print("Enter the Account type and number to withdraw money from: ");
				data1 = input.nextLine();
				System.out.print("Enter amount of money to withdraw: ");
				value = input.nextInt();

				if (data1.equals("s1")) {
					s1.withdraw(value);
				} else if (data1.equals("s2")) {
					s2.withdraw(value);
				} else if (data1.equals("c1")) {
					c1.withdraw(value);
				}

			} else if (menu == 3) {
				input.nextLine();
				System.out.print("Enter the Account type and number to transer money from: ");
				data1 = input.nextLine();
				System.out.print("Enter the Account type and number to transfer: ");
				data2 = input.nextLine();
				System.out.print("Enter amount of money to transfer: ");
				value = input.nextInt();

				if (data1.equals("s1")) {
					if (data2.equals("s2")) {
						s1.transfer(value, s2);
					} else if (data2 == "c1") {
						s1.transfer(value, c1);
					}
				} else if (data1.equals("s2")) {
					if (data2.equals("s1")) {
						s2.transfer(value, s1);
					} else if (data2.equals("c1")) {
						s2.transfer(value, c1);
					}
				} else if (data1.equals("c1")) {
					if (data2.equals("s1")) {
						c1.transfer(value, s1);
					} else if (data2.equals("s2")) {
						c1.transfer(value, s2);
					}
				}

			} else if (menu == 4) {
				key = false;
				System.out.println("Balance at the end of the mounth:");
				System.out.println("Saving Account 1: " + s1.getBalance());
				System.out.println("Saving Account 2: " + s2.getBalance());
				System.out.println("Checking Account 3: " + c1.getBalance());
			}
		}
	}

}
