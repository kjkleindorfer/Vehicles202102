package model;

public class Train {
	private String model;
	private int year;
	private String origin;
	
	
	public Train(){
		
	}
	
	public Train(String model, int year, String origin) {
		this.model = model;
		this.year = year;
		this.origin = origin;
	}
	
	public String makeNoise() {
		String noise = "Choooo Choooo";
		return noise;
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
