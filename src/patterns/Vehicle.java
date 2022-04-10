package patterns;

public abstract class Vehicle {
	public abstract int getVehicle();

	public String toString() {
		return "wheel " + this.getVehicle();
	}

}
