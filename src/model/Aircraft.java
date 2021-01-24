package model;

// added by Shravan

public class Aircraft {
	private String type;
	private String modelName;
	private int topSpeed;
	private int range;
	private int weight;
	private int unitCost;
	private String engineType;
	private String manufacturer;
	
	public Aircraft() {
		super();
	}

	public Aircraft(String type, String modelName, int topSpeed, int range, int weight, int unitCost, String engineType,
			String manufacturer) {
		super();
		this.type = type;
		this.modelName = modelName;
		this.topSpeed = topSpeed;
		this.range = range;
		this.weight = weight;
		this.unitCost = unitCost;
		this.engineType = engineType;
		this.manufacturer = manufacturer;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String makeNoise() {
		return "chakk-chackk-chak-chak, chak-a-chak-akk-chk-chk-chk";
	}

	@Override
	public String toString() {
		return "Aircraft [type=" + type + ", modelName=" + modelName + ", topSpeed=" + topSpeed + ", range=" + range
				+ ", weight=" + weight + ", unitCost=" + unitCost + ", engineType=" + engineType + ", manufacturer="
				+ manufacturer + "]";
	}
}
