package Inheritance;

public class Car  extends Vehicle {
	String safety;
	String musicSystem;
	String AirSource;
	int windows;
	
	public String getSafety() {
		return safety;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirSource() {
		return AirSource;
	}
	public int getWindows() {
		return windows;
	}
	public void setSafety(String safety) {
		this.safety = safety;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	public void setAirSource(String airSource) {
		AirSource = airSource;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public void show()
	{
		System.out.println(" MOdelName : " + modelName + " , EnginePower in CC : " + enginePower + " , Topspeed of vehicle  : "  + Topspeed + " , Fuel type :  " + fuelType );
		System.out.println(" Number of seats : " +numberOfSeats+ " , Average of car : " + avg+ " , Year of Manufacture : " + buildYear );
		System.out.println(" Type of safty : " + safety+ " , MusicSystem Type : " + musicSystem+ " , Type of cooling  :" + AirSource+ ", Number of Windows : " +windows);
	}
	
	public static void main(String[] args) {
		
		Car obj=new Car();
		obj.setAirSource("Ac");
		obj.setAvg(30);
		obj.setBuildYear(2022);
		obj.setEnginePower(998);
		obj.setFuelType("Diesel");
		obj.setModelName("Wagon R");
		obj.setMusicSystem("woodman X9");
		obj.setNumberOfSeats(5);
		obj.setSafety("AirBag");
		obj.setTopspeed(220);
		obj.setWindows(4);
		
		obj.show();
		
	}

}
