
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	
	//no argument constructor
	public Car() {
		make = "";
		model = "";
		year = 0000;
		price = 0.0;
	}
	
	//constructor with all arguments
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//toString method
	public String toString() {
		return String.format("Make: %-15s Model: %-15s Year: %-15s Price: $%-,15.0f", make, model, year, price);

	}
	
	//getters and setters
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
}
