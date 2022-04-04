package lab2;

public class Main {

	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House();

		Resident r1 = new Resident();
		Resident r2 = new Resident();

		r1.getResident();
		h1.AddResident(r1);
		h1.getRoom1().getRoom();
		h1.getRoom2().getRoom();
		h1.getRoom1().printRoom();
		h1.getRoom2().printRoom();
		h1.calculateTotalM2();
		h1.getResident().printResident();
		
		
		/*r2.getResident();
		h2.AddResident(r2);
		h2.getRoom1().getRoom();
		h2.getRoom2().getRoom();
		h2.getRoom1().printRoom();
		h2.getRoom2().printRoom();
		h2.getResident().printResident();
		*/
				
	}

}
