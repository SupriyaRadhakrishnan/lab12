
public class UsedCar extends Car {

	private double mileage;

	public UsedCar(double mileage) {
		super();
		this.setMileage(mileage);
	}

	public UsedCar(String make, String model, int year, double price, double mileage,Dealership dealers) {
		super(make, model, year, price,dealers);
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
		return String.format("%-20s  %-10s  %-10s  %-10s  %-4s  %-15s  %-10s", getDealers().getName(),getDealers().getCity(),getMake(), getModel(), getYear(),
				"$"+getPrice() + "(Used)", getMileage());
	}

}
