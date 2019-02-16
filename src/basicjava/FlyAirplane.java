package basicjava;

public class FlyAirplane {

	public static void main(String[] args) {
		takeOff();
		fly();
		land();
	}

	public static void takeOff() {
		System.out.println("push Back From Gate");
		System.out.println("taxi To Runway");
		System.out.println("increase Speed Until Off Ground");
		System.out.println("climb To Cruise Altitude");

	}

	public static void fly() {
		System.out.println("In the air. Flight is 2 hours");
	}

	public static void land() {
		System.out.println("Ready to land in 10 minutes");
	}

}
