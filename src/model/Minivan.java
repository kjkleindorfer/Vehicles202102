package model;

//added by Alex Ryberg

public class Minivan {

	private String make;
	private String model;
	private int age;
	
	public Minivan() {
		super();
	}

	public Minivan(String make, String model, int age) {
		super();
		this.make = make;
		this.model = model;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Minivan [make=" + make + ", model=" + model + ", age=" + age + "]";
	}
	
	public String makeNoise() {
		return "Don't make me turn this car around!";
	}
}
