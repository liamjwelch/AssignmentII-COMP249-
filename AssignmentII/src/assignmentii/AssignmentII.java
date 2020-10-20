// ----------------------------------------------------- 
// Part: (PHASE I)
// Written by: (Liam Welch, 40136341) 
// -----------------------------------------------------

package assignmentii;

import packageI.Airplane;
import packageII.*;
import packageIII.Multirotor;
import packageIV.*;

/**
 *
 * @author liamw
 */
public class AssignmentII {


    public static void main(String[] args) {

    //Phase I
    	
    //Two identical airplanes created with the default constructor
    //For purpose of testing the equals()
    Airplane airplane1 = new Airplane();
    Airplane airplane2 = new Airplane();
    
    Helicopter helicopter1 = new Helicopter("MegaChopper", 45000.99, 8, 24, 2019, 2);
    Helicopter helicopter2 = new Helicopter("SuperChopper", 43563456.45, 9, 48, 2018, 2);
    Helicopter helicopter3 = new Helicopter("OldChopper", 120.22, 8, 4, 2010, 1);
    //Using copyConstructor to test for Equality
    Quadcopter quadcopter1 = new Quadcopter();
    Quadcopter quadcopter2 = new Quadcopter(quadcopter1);    
    
    
    Multirotor multirotor1 = new Multirotor("RotorCompany", 12000, 65, 8, 2015, 4, 6);
    Multirotor multirotor2 = new Multirotor(multirotor1);
    Multirotor multirotor3 = new Multirotor("MegaROTO", 14000, 6, 87, 2021, 2, 12);

    
    AgriculturalDrone ag1 = new AgriculturalDrone();
    AgriculturalDrone ag2 = new AgriculturalDrone(1200.22, 1800.99, "Farmer's Little Helper", 1);
    
    MAV mav1 = new MAV();
    MAV mav2 = new MAV(2000, 9999.99, "OKCOMPUTER", 5);
    

    UAV uav1 = new UAV(5600.66, 6666.66);
    
    
 

    
    System.out.println(airplane1);
    
    System.out.println("Testing the equality of two airplane objects, the result of testing the default constructor"
    		+ " returns the value of: " + airplane1.equals(airplane2));
    System.out.println("Testing the equality of two helicopter objects, the result of using two different paramaterized constructors,"
    		+ " the result returns: " +  helicopter1.equals(helicopter2));
    System.out.println("Testing the equality of two objects created using a copy constructor,"
    		+ "the result returns: " + multirotor1.equals(multirotor2));
    
    //Unsuccessful attempts until I realized what was necessary
    // Airplane[] airplaneInventory = new Airplane[10];
     //Object[] vehicleInventory = new Object[3];
    
    UFO[] ufoInventory = new UFO[15];
    
    ufoInventory[0] = airplane1;
    ufoInventory[1] = airplane2;
    ufoInventory[2] = helicopter1;
    ufoInventory[3] = helicopter2;
    ufoInventory[4] = helicopter3;
    ufoInventory[5] = quadcopter1;
    ufoInventory[6] = quadcopter2;
    ufoInventory[7] = multirotor1;
    ufoInventory[8] = multirotor2;
    ufoInventory[9] = multirotor3;
    ufoInventory[10] = ag1;
    ufoInventory[11] = ag2;
    ufoInventory[12] = mav1;
    ufoInventory[13] = mav2;
    ufoInventory[14] = uav1;

    Double minValue1 = Double.MAX_VALUE;
    Double minValue2 = minValue1;
    int indexMinValue1 = 0;
    int indexMinValue2 = 0;
    
    for (int i=0; i < ufoInventory.length; i++) {
    	
    	if (ufoInventory[i].getPrice() < minValue1) {
    		
    		minValue2 = minValue1;
    		minValue1 = ufoInventory[i].getPrice();
    		indexMinValue2 = indexMinValue1;
    		indexMinValue1 = i;
    		
    	}
    	
    	System.out.println(" Min2 = " + minValue2 + " Min1 = " + minValue1);
		System.out.println(" index2 = " + indexMinValue2 + " index1 = " + indexMinValue1);
    }
    
    
    
    
    }
    
}
