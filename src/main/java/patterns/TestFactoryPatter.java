package patterns;

public class TestFactoryPatter {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		System.out.println(factory.getInstance("car", 4));
		System.out.println(factory.getInstance("bike", 2));

	}

}
