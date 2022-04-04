package c1711060_question1;

import java.util.Scanner;

public class c1711060_question1 {

	public static void main(String[] args) {
		String left = "left-to-right";
		String right = "right-to-left";
		Scanner input = new Scanner(System.in);
		int[] integers = new int[10];
		String[] getInp = new String[11];
		
		System.out.print("Enter 10 integers and order of summations: ");
		
		for(int i=0; i<10; i++) {
			getInp[i] = input.next();
			integers[i] = Integer.parseInt(getInp[i]);
		}
		getInp[10] = input.next();
		
		if(getInp[10].equals(left)) {
			System.out.print("Result: ");
			for(int i=1; i<11; i++) {
				int tmp = 0;
				for(int j=0; j<i; j++) {
					tmp += integers[j];
				}
				System.out.print(tmp + " ");
			}
		}
		else if(getInp[10].equals(right)) {
			System.out.print("Result: ");
			for(int i=0; i<10; i++) {
				int tmp = 0;
				for(int j=9; j>i-1; j--) {
					tmp += integers[j];
				}
				System.out.print(tmp + " ");
			}
		}

	}

}
