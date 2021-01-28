package model;

//added by Nathan

public class Limo {
	
	private String model;
	private String color;
	private int seating;
	
	public Limo() {
		super();
	}
	
	public Limo(String model, String color, int seating) {
		super();
		this.model = model;
		this.color = color;
		this.seating = seating;

	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}
	
	public String noise() {
		return "clank clank clank";
	}

	@Override
	public String toString() {
		return "Limo [model=" + model + ", color=" + color + ", seating=" + seating +"]";
	}
}
