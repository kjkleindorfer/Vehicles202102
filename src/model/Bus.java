package model;

//class by Levi

public class Bus {
	
	private String color;
	private String manufacturer;
	private double gallonTank;
	private static final String noise = "vroom vroom";
	
	public Bus()
	{
		color = "";
		manufacturer = "";
		gallonTank = 0;
	}
	
	public Bus (String color, String manufacturer, double gallonTank)
	{
		this.color = color;
		this.manufacturer = manufacturer;
		this.gallonTank = gallonTank;
	}
	
	public String makeNoise()
	{
		return noise;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getGallonTank() {
		return gallonTank;
	}

	public void setGallonTank(double gallonTank) {
		this.gallonTank = gallonTank;
	}
	
}
