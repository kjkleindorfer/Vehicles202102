package model;

// added by Kristopher

public class Motorcycle {
	private String make;
	private String model;
	private int engineDisplacement;
	
	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motorcycle(String make, String model, int engineDisplacement) {
		super();
		this.make = make;
		this.model = model;
		this.engineDisplacement = engineDisplacement;
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
	public int getEngineDisplacement() {
		return engineDisplacement;
	}
	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	public String toString() {
		return "Motorcycle [Make=" + make + ", Model=" + model + ", Engine=" + engineDisplacement + "]";
	}
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Vroooooom!";
	}

}