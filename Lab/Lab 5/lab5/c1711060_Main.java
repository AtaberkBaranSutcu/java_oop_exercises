package labend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		int length;
		String c = "true";
		Calculator calculator = new Calculator();
		Scanner input = new Scanner(System.in);

		System.out.print("Length of first number set: ");
		length = input.nextInt();
		calculator.setLength(length);
		int[] arr1 = new int[length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}
		calculator.setArr1(arr1);

		System.out.print("1st set entered: ");
		for (int num : arr1) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();

		System.out.print("Length of second number set: ");
		int[] arr2 = new int[input.nextInt()];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = input.nextInt();
		}
		calculator.setArr2(arr2);

		System.out.print("2nd set entered: ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();
		
		while (!c.equals("exit")) {
			System.out.print("Choose operation: ");
			c = input.next();
			if (!c.equals("exit")) {
				for (int print : calculator.Calculate(calculator, c.charAt(0))) {
					System.out.print(print + " ");
				}
				System.out.println();
			}
		}
		System.out.println("END");

	}

}
