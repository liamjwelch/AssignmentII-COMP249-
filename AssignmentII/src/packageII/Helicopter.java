// ----------------------------------------------------- 
// Part: (PHASE I)
// Written by: (Liam Welch, 40136341) 
// -----------------------------------------------------

package packageII;

import packageI.Airplane;

/**
 *
 * @author liamw
 */
public class Helicopter extends Airplane {
    
	private int numOfCylinders;
	private int creationYear;
	private int passengerCapacity;
    
    
    public Helicopter() {
    	super();
    	numOfCylinders = 4;
    	creationYear = 1999;
    	passengerCapacity=8;
    	
    }
    
	public Helicopter(String brand, double price, int horsePower, int numOfCylinders, int creationYear,
			int passengerCapacity) {
		super(brand, price, horsePower);
		this.numOfCylinders = numOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}
    
	public Helicopter(Helicopter helicopter) {
		super(helicopter);
		this.numOfCylinders = helicopter.numOfCylinders;
		this.creationYear = helicopter.creationYear;
		this.passengerCapacity = helicopter.passengerCapacity;
	}

	public int getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return (super.toString() + " there are " + numOfCylinders + " cylinders, it was made in " + creationYear
				+ ", it can carry" + passengerCapacity + " passengers.");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + creationYear;
		result = prime * result + numOfCylinders;
		result = prime * result + passengerCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		if (creationYear != other.creationYear)
			return false;
		if (numOfCylinders != other.numOfCylinders)
			return false;
		if (passengerCapacity != other.passengerCapacity)
			return false;
		return true;
	}

	

	
 
    
    
	
	
	
    
    
    
}
