package c1711060_question3;

import java.util.Scanner;

public class c1711060_question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int counter = 1;
		String inputStr;
		char[] chars = new char[26];
		
		System.out.print("Enter your letters: ");
		inputStr = sc.nextLine();
		
		chars = inputStr.toCharArray();
		
		if(inputStr.length() == 26) {	
			for(int i=0; i<chars.length; i++) {
				if(i == chars.length-1) {
					System.out.print(counter);
				}
				else if(chars[i] == chars[i+1]) {
					counter++;
				}
				else
				{
					System.out.print(counter + " ");
					counter = 1;
				}
			}
		}
		else
		{
			System.err.println("Invalid length!");
		}
	}
}
