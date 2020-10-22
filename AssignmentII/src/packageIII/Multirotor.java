/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageIII;

import packageII.Helicopter;

/**
 *
 * @author liamw
 */
public class Multirotor extends Helicopter {
    
	private int numberOfRotors;

    public Multirotor() {
    	super();
    	numberOfRotors = 6;
    }
    
	public Multirotor(String brand, double price, int horsePower, int numOfCylinders, int creationYear,
			int passengerCapacity, int numberOfRotors) {
		super(brand, price, horsePower, numOfCylinders, creationYear, passengerCapacity);
		this.numberOfRotors = numberOfRotors;
	}
    
	public Multirotor(Multirotor multirotor) {
		super(multirotor);
		this.numberOfRotors = multirotor.numberOfRotors;
	}

	
	
	@Override
	public String toString() {
		return (super.toString() + "\nHELICOPTER IS OF TYPE MULTIROTOR. It has " + numberOfRotors + " rotors.");
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multirotor other = (Multirotor) obj;
		if (numberOfRotors != other.numberOfRotors)
			return false;
		return true;
	}
    
	
	
	
    
}
