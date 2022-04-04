package lab2;

import java.util.Scanner;

public class Resident {
	private String name;
	private String lastname;
	
	//constructor
	public Resident() {
		this.name = "NA";
		this.lastname = "NA";
	}

	public void getResident(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("-------Resident Information--------");
		System.out.print("Name: ");
		name = myObj.nextLine();
		System.out.print("Last Name: ");
		lastname = myObj.nextLine();
	}
	
	public void printResident(){
		System.out.println("Resident Name: " + name + ", " + "Resident Last Name: " + lastname);
	}
	
}
