package c1711060_question2_main;

import java.util.Scanner;

public class c1711060_question2_vehicle {
	
	Scanner input = new Scanner(System.in);

	private char type;
	private double entertime;
	private double leavetime;
	private double price;
	
	public c1711060_question2_vehicle() {
		this.type = ' ';
		this.entertime = 0;
		this.leavetime = 0;
		this.price = 0;	
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		if(type=='C' || type=='B') {
			this.type = type;
		}
		else 
			System.err.println("Invalid character!");
	}

	public double getEntertime() {
		return entertime;
	}

	public void setEntertime(double entertime) {
		if(entertime>=0 && entertime<=24) {
			this.entertime = entertime;
		}
		else
			System.err.println("Invalid time!");
	}

	public double getLeavetime() {
		return leavetime;
	}

	public void setLeavetime(double leavetime) {
		if(leavetime>=0 && leavetime<=24) {
			this.leavetime = leavetime;
		}
		else
			System.err.println("Invalid time!");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price of " + type + ": " + price + " $";
	}

	public void print() {
		System.out.println(this);
	}
	
	public void bestFunc() {
		System.out.print("Enter vehicle type, time entering parking lot, time leaving parking lot: ");
		setType(input.next().charAt(0));
		setEntertime(input.nextDouble());
		setLeavetime(input.nextDouble());
		
		moneyCal();
		print();
	}
	
	public void moneyCal() {
		if(type == 'C') {
			if(leavetime - entertime <= 3) {
				setPrice(0);
			}
			else
			{
				setPrice((leavetime - entertime - 3) * 1.5);
			}
		}
		else if(type == 'B') {
			if(leavetime - entertime <= 2) {
				setPrice(leavetime - entertime);
			}
			else
			{
				setPrice(2 + (leavetime - entertime - 2) * 2.3);
			}
		}
	}
}
