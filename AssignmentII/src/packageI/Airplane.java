/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageI;

/**
 *
 * @author liamw
 */
public class Airplane {
    
    private String brand;
    private double price;
    private int horsePower;
    
    
    
    public Airplane() {
    	brand = "Boeing";
    	price = 666;
    	horsePower = 555;
    	
    	
    }
    
	public Airplane(String brand, double price, int horsePower) {
		super();
		this.brand = brand;
		this.price = price;
		this.horsePower = horsePower;
	}
    
	
	//Copy Constructor
    
	public Airplane(Airplane airplane) {
		this.brand = airplane.brand;
		this.price = airplane.price;
		this.horsePower = airplane.horsePower;
	}

	
	
	//getters setters 
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	@Override
	public String toString() {
		return "This airplane's brand is " + brand + ", it costs " + price + "$, it has a horse power of " + horsePower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + horsePower;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (horsePower != other.horsePower)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	




	
    
	
    
}
