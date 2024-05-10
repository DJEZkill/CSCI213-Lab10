



public class Car extends Vehicle {
	// instance variables
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers) {
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public String toString() {
		return String.format("%d-door %s %s with license %s", this.doors, this.getMake(), this.getModel(), this.getPlate());
	}
	
	@Override
	public boolean equals(Object obj) {
		if( ! (obj instanceof Car)) {
				return false;
		}
		Car other = (Car) obj;
		return super.equals(other);
			
	}
	
	public Car copy(){
	// get the data
	//this.doors = theDoors;
	//this.passengers = thePassengers;
	
	//return a copy
	return new Car(this.getMake(), this.getModel(), this.getPlate(), this.doors, this.passengers);
	}
}