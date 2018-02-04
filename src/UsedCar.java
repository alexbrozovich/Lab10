
public class UsedCar extends Car{
	private double mileage;

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return String.format("Make: %-15s Model: %-15s Year: %-15s Price: $%-,15.0f Mileage: %-,15.0f", super.getMake(), super.getModel(), super.getYear(), super.getPrice(), this.mileage);
	}
	
	
}
