package model;

// Added by Levi Shepherd

public class Truck {
	
	private String make;
	private String model;
	private int year;
	
	/**
	 * Default No-Arg Constructor
	 */
	public Truck() {
		super();
	}

	/**
	 * @param make
	 * @param model
	 * @param year
	 */
	public Truck(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
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

	@Override
	public String toString() {
		return "Truck [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
	public String makeNoise() {
		return "Vroom Vroom!";
	}
	
}
