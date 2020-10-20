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
public class MAV extends UAV {
    
	private String model;
	private double size;
    
    
 
    public MAV() {
    	super();
    	model = "Vincent's";
    	size=77.77;
    }
    
    
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	
	public MAV(MAV mav) {
		super(mav);
		this.model = mav.model;
		this.size = mav.size;
		
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return ((super.toString() + "the model is " + model + ", it is " + size + "cm." ));
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MAV other = (MAV) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}
	
	
    
    
    
}
