
public class UsedCar extends Car {

	private double mileage;

	public UsedCar(double mileage) {
		super();
		this.setMileage(mileage);
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.setMileage(mileage);
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("%-10s  %-10s  %-4s  %-15s  %-10s", getMake(), getModel(), getYear(),
				"$"+getPrice() + "(Used)", getMileage());
	}

}
