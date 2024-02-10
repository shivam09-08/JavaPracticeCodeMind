package Inheritance;

public class Vehicle {
	
	String modelName;
	int enginePower;
	int Topspeed;
	String fuelType;
	int avg;
	int numberOfSeats;
	int buildYear;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public int getTopspeed() {
		return Topspeed;
	}
	public void setTopspeed(int topspeed) {
		Topspeed = topspeed;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public int getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	
	public void show()
	{
		System.out.println("MOdelName : " + modelName + " , EnginePower in CC : " + enginePower + " , Topspeed of vehicle  : "  + Topspeed + " , Fuel type :  " + fuelType );
	}

}
