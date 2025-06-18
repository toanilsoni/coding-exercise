package patterns;

public class Car extends Vehicle {
    int wheel;
    
    Car(int wheel){
    	this.wheel = wheel;
    }
    
	@Override
	public int getVehicle() {
		return this.wheel;
	}

}
