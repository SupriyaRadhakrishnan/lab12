
public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
    private Dealership dealers;
	public Car() {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public Car(String make, String model, int year, double price,Dealership dealers) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.dealers = dealers;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Dealership getDealers() {
		return dealers;
	}

	public void setDealers(Dealership dealers) {
		this.dealers = dealers;
	}
	@Override
	public String toString() {
		return String.format("%-20s  %-10s  %-10s  %-10s  %-4s  %-15s", getDealers().getName(),getDealers().getCity(),getMake(), getModel(), getYear(), "$"+getPrice());
	}

	
}
