// ----------------------------------------------------- 
// Part: (PHASE I)
// Written by: (Liam Welch, 40136341) 
// -----------------------------------------------------


package assignmentii;

public abstract class UFO {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nINCOMING UFO DETECTED...\n"
				+ "UFO IDENTIFIED: ";
	}
	
	

}
