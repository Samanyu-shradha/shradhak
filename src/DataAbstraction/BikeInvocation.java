package DataAbstraction;

public class BikeInvocation {
	public static void main(String[] args) {
		Bike harley = new Harley();
		Bike honda = new Honda();
		Harley harley1 = new Harley();
		harley1.Harley1();
		harley.run1();
		harley.speed();
		honda.run1();
	}
}
