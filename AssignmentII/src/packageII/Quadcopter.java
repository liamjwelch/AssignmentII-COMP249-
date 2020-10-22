// ----------------------------------------------------- 
// Part: (PHASE I)
// Written by: (Liam Welch, 40136341) 
// -----------------------------------------------------

package packageII;

/**
 *
 * @author liamw
 */
public class Quadcopter extends Helicopter {
    
	private int maxFlyingSpeed;

    
    public Quadcopter() {
    	super();
    	maxFlyingSpeed=99999;
    	
    }
	public Quadcopter(String brand, double price, int horsePower, int numOfCylinders, int creationYear,
			int passengerCapacity, int maxFlyingSpeed) {
		
		super(brand, price, horsePower, numOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
    
	public Quadcopter(Quadcopter quadcopter) {
		super(quadcopter);
		this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;

	}

	
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	
	@Override
	public String toString() {
		return (super.toString() + "\nHELICOPTER IS OF TYPE QUADCOPTER. It has a maximum flying speed of " + maxFlyingSpeed+".");
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadcopter other = (Quadcopter) obj;
		if (maxFlyingSpeed != other.maxFlyingSpeed)
			return false;
		return true;
	}
    
	
	
    
	
	
	
    
}
