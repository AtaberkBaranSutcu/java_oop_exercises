package lab2;

public class House {
	private Room room1;
	private Room room2;
	private Resident person;
	private int totalm2;

	// default constructor
	public House() {
		room1 = new Room(); // composition
		room2 = new Room(); // composition
		person = null; // aggregation
		totalm2 = 0;
	}

	// copy constructor
	public House(House obj) {
		room1 = new Room(obj.room1); // composition
		room2 = new Room(obj.room2); // composition
		person = obj.person; // OK (aggregation)
		totalm2 = obj.totalm2; // OK (primitive type)
	}

	public void AddResident(Resident person) {
		this.person = person; // OK (aggregation)
	}
	
	public Resident getResident() {
		return person;
	}

	public int getTotalm2() {
		totalm2 = room1.getM2() + room2.getM2();
		return totalm2; // OK (primitive type)
	}

	public void calculateTotalM2() {
		System.out.println("Total m2 of the house: " + getTotalm2());
	}

	public Room getRoom1() {
		return room1;
		//return new Room(room1);
	}

	public void setRoom1(Room room1) {
		this.room1 = new Room(room1);
	}

	public Room getRoom2() {
		return room2;
		//return new Room(room2);
	}

	public void setRoom2(Room room2) {
		this.room2 = new Room(room2);
	}
	
	
}
