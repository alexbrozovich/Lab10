import java.util.ArrayList;
import java.util.Scanner;

public class LabTen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//create all Car / usedCar objects to be used in the program
		Car new1 = new Car("Dodge", "Stratus", 2002, 2000);
		Car new2 = new Car("Ford", "Pinto", 1985, 2);
		Car new3 = new Car("Reliant", "Robin", 1776, 3000000);
		UsedCar used1 = new UsedCar("Mercury", "Grand Marquis", 2004, 1000, 69000);
		UsedCar used2 = new UsedCar("Lamborghini", "Murcielago", 1997, 120000, 25000);
		UsedCar used3 = new UsedCar("Tesla", "Model 3", 2015, 30000, 65000);
		
		//create the list and add all of the cars to it
		ArrayList<Car> carLot = new ArrayList<>();
		carLot.add(new1);
		carLot.add(new2);
		carLot.add(new3);
		carLot.add(used1);
		carLot.add(used2);
		carLot.add(used3);
		
		//for (int i = 0; i < carLot.size(); i++) {
		//	System.out.println(carLot.get(i));
		//}
		
		System.out.println("Welcome to the Grand Circus car lot!");
		int userIn = 0;
		char keepGoing = 'y';
		while (keepGoing == 'y') {
			System.out.println("We have 6 different cars in our car lot, which one would you like to check out?");
			System.out.println("Please enter a number between 1 and 6: ");
			userIn = scan.nextInt();
			System.out.println(carLot.get(userIn - 1));
			System.out.println("Would you like to see another car?");
			keepGoing = scan.next().charAt(0);
		}
		scan.close();
		System.out.println("Goodbye!");
	}
}
