import java.util.*;

public class ClassApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Honda", "CR-V", 2017, 15000);
		Car car2 = new Car("Jeep", "Compass", 2016, 12000);
		Car car3 = new Car("Jeep", "Cherokee", 2018, 10000);
		UsedCar usedcar1 = new UsedCar("Dodge", "Challenger", 2018, 20000, 20000);
		UsedCar usedcar2 = new UsedCar("Audi", "A6", 2015, 13500, 10000);
		UsedCar usedcar3 = new UsedCar("Suzuki", "Amaze", 2014, 23000, 40000);

		ArrayList<Car> listOfCars = new ArrayList<>();
		listOfCars.add(car1);
		listOfCars.add(car2);
		listOfCars.add(car3);
		listOfCars.add(usedcar1);
		listOfCars.add(usedcar2);
		listOfCars.add(usedcar3);

		Scanner scnr = new Scanner(System.in);
		boolean flag = true;
		do {
			display(listOfCars);
			int userChoice = Validator.getInt(scnr, "Which car would you like? ");
			if (userChoice >= 1 && userChoice <= listOfCars.size()) {
				userChoice -= 1;
				if (listOfCars.get(userChoice) instanceof UsedCar) {

					System.out.println((UsedCar) listOfCars.get(userChoice));
				} else
					System.out.println(listOfCars.get(userChoice));
				if (Validator.getYesNo(scnr, "Would you like to buy this car? ")) {
					listOfCars.remove(userChoice);
					System.out.println("Excellent! Our finance department will be in touch shortly.");
				}
			} else {
				System.out.println("Have a Great Day!");
				flag = false;
			}

		} while (flag);
	}

	public static void display(ArrayList<Car> listOfCars) {
		System.out.printf("%-4s %-10s  %-10s  %-4s  %-15s  %-10s\n", "SNo", "Make", "Model", "Year", "Price",
				"Mileage");
		for (int i = 0; i < listOfCars.size(); i++) {
			if (listOfCars.get(i) instanceof UsedCar) {

				System.out.printf("%-4s ", i + 1);
				System.out.println(listOfCars.get(i));
			} else {
				System.out.printf("%-4s ", i + 1);
				System.out.println(listOfCars.get(i));
			}

		}
		System.out.printf("%-4s %-10s\n", listOfCars.size() + 1, "Quit");
	}
}