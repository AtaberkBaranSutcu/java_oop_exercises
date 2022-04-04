package lab2;

import java.util.Scanner;

public class Room {
	private int m2;
	private String balcony;

	// default constructor
	public Room() {
		m2 = 0;
		balcony = "NA";
	}

	// copy constructor
	public Room(Room obj) {
		m2 = obj.m2; // Shallow copy
		balcony = obj.balcony; // Shallow copy
	}

	public void getRoom() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("-------Room Information--------");
		System.out.print("Enter m2 of room: ");
		m2 = myObj.nextInt();
		System.out.print("Does room have a balcony: ");
		balcony = myObj.next();
	}

	public void printRoom() {
		System.out.println("m2: " + getM2() + ", Balcony: " + getBalcony());
	}

	public int getM2() {
		return m2; // OK (primitive type)
	}

	public void setM2(int m2) {
		this.m2 = m2; // OK (primitive type)
	}

	public String getBalcony() {
		return balcony; // OK (immutable type)
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony; // OK (immutable type)
	}

}
