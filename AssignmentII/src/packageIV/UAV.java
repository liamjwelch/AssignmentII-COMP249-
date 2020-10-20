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
public class UAV {
    
	private double weight;
	private double price;
    
    
    public UAV() {
    	super();
    	weight = 99.99;
    	price = 5.55;
    }
    
	public UAV(double weight, double price) {
		super();
		this.weight = weight;
		this.price = price;
	}
	
	public UAV(UAV uav) {
		this.weight = uav.weight;
		this.price = uav.price;
		
	}

	
	//GETTERS SETTERS
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return (super.toString() + "This UAV weighs " + weight + "kg, and costs" + price + "$.");
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UAV other = (UAV) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
	

	
    
    
}
