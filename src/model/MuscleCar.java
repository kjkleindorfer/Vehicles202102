package model;

public class MuscleCar {
	//Ethan Dorenkamp
	
	private String Model;
	private int horsepower;
	private int zeroToSixtyTime;
	
	public MuscleCar() {
		super();
	}

	public MuscleCar(String model, int horsepower, int zeroToSixtyTime) {
		super();
		Model = model;
		this.horsepower = horsepower;
		this.zeroToSixtyTime = zeroToSixtyTime;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getZeroToSixtyTime() {
		return zeroToSixtyTime;
	}

	public void setZeroToSixtyTime(int zeroToSixtyTime) {
		this.zeroToSixtyTime = zeroToSixtyTime;
	}

	@Override
	public String toString() {
		return "MuscleCar [Model=" + Model + ", horsepower=" + horsepower + ", zeroToSixtyTime=" + zeroToSixtyTime
				+ "]";
	}
	
	public String makeNoise() {
		return "vroom vroom";
	}
}
