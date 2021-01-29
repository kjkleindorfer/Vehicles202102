package model;

// class by Devin Baack

public class Bicycle {
	
	private String color;
	private String brand;
	private double price;
	
	public Bicycle() {
		super();
	}

	public Bicycle(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String makeNoise() {
		return "Ding Ding!";
	}
	
	@Override
	public String toString() {
		return "Bicycle [color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
