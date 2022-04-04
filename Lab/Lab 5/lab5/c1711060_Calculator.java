package labend;

public class Calculator {
	private int[] arr1;
	private int[] arr2;
	private int length;

	public Calculator() {
	}

	public Calculator(int length) {
		this.length = length;
	}

	public int[] Calculate(Calculator obj, char c) throws Exception {
		if (obj.getArr1().length != obj.getArr2().length) {
			throw new Exception("Lengths of array1 and array2 are not equal.");
		} else {
			int[] temp = new int[obj.length];

			if (c == '+') {
				for (int i = 0; i < length; i++) {
					temp[i] = obj.getArr1()[i] + obj.getArr2()[i];
				}
				return temp;
			} else if (c == '-') {
				for (int i = 0; i < length; i++) {
					temp[i] = obj.getArr1()[i] - obj.getArr2()[i];
				}
				return temp;
			} else if (c == '*') {
				for (int i = 0; i < length; i++) {
					temp[i] = obj.getArr1()[i] * obj.getArr2()[i];
				}
				return temp;
			} else if (c == '/') {
				try {
					for (int i = 0; i < length; i++) {
						temp[i] = obj.getArr1()[i] / obj.getArr2()[i];
					}
				} catch (ArithmeticException e) {
					System.err.println("Divided by zero!!!");
					return obj.getArr1();
				}
				return temp;
			} else
				return null;
		}

	}

	public void inputArr1() {
		int x = 0;
		try {
			for (int i = 0; i <= arr1.length; i++)
				x += arr1[i];
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Out of bounds!!");
		} catch (NumberFormatException e) {
			System.err.println();
		}
	}

	public void inputArr2() {
		int x = 0;
		try {
			for (int i = 0; i <= arr2.length; i++)
				x += arr2[i];
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Out of bounds!!");
		} catch (NumberFormatException e) {
			System.err.println();
		}
	}

	public int[] getArr1() {
		return arr1;
	}

	public void setArr1(int[] arr1) {
		this.arr1 = arr1;
	}

	public int[] getArr2() {
		return arr2;
	}

	public void setArr2(int[] arr2) {
		this.arr2 = arr2;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
