import java.util.*;

public class ClassApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> listOfCars = new ArrayList<>();
		System.out.println("Welcome to the Grand Circus Motors Admin Console");
		int numOfCars = Validator.getInt(scnr, "How many cars are you entering");

		for (int i = 1; i <= numOfCars; i++) {
			String make = Validator.getString(scnr, "Enter car #" + i + " Make");
			String model = Validator.getString(scnr, "Enter car #" + i + " Model");
			int year = Validator.getInt(scnr, "Enter car #" + i + " Year");
			double price = Validator.getDouble(scnr, "Enter car #" + i + " Price");
			Car car = new Car(make, model, year, price);
			listOfCars.add(car);

		}
		System.out.println("Current Inventory:");
		System.out.printf("%-10s  %-10s  %-4s  %-15s\n", "Make", "Model", "Year", "Price");
		for (Car c : listOfCars) {
			System.out.println(c);
		}

	}

}
