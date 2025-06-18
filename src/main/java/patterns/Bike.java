package patterns;

public class Bike extends Vehicle {
	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getVehicle() {
		return this.wheel;
	}

}
