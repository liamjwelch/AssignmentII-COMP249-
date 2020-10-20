/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageIV;

/**
 *
 * @author liamw
 */
public class AgriculturalDrone extends UAV {
    
	private String brand;
	private int carryingCapacity;
    
    public AgriculturalDrone() {
    	super();
    	brand = "classic";
    	carryingCapacity=89;
    }
    
	public AgriculturalDrone(double weight, double price, String brand, int carryingCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryingCapacity = carryingCapacity;
	}
    
	public AgriculturalDrone(AgriculturalDrone ag) {
		super(ag);
		this.brand = ag.brand;
		this.carryingCapacity = ag.carryingCapacity;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

	@Override
	public String toString() {
		return (super.toString() + " it is " + brand + ", and has a carrying capacity of" + carryingCapacity
				+ " passengers.");
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgriculturalDrone other = (AgriculturalDrone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (carryingCapacity != other.carryingCapacity)
			return false;
		return true;
	}
    
	
	
	
    
    
}
