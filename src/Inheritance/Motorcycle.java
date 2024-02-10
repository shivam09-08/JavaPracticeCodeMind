package Inheritance;

public class Motorcycle extends Vehicle {
	
	String breakType;
	String Stuent;
	
	
	public String getBreakType() {
		return breakType;
	}
	public String getStuent() {
		return Stuent;
	}
	public void setBreakType(String breakType) {
		this.breakType = breakType;
	}
	public void setStuent(String stuent) {
		Stuent = stuent;
	}
	
	public void show()
	{
		System.out.println(" MOdelName : " + modelName + " , EnginePower in CC : " + enginePower + " , Topspeed of vehicle  : "  + Topspeed + " , Fuel type :  " + fuelType );
		System.out.println(" Number of seats : " +numberOfSeats+ " , Average of bike : " + avg+ " , Year of Manufacture : " + buildYear );
		System.out.println(" Type of Break : " + breakType+ " , Stuent Type : " + Stuent  );
	}
	
	
	public static void main(String[] args) {
		Motorcycle obj =new Motorcycle();
		
		
		obj.setBreakType("Disk");
		obj.setStuent("whelle");
		obj.setModelName("pulser");
		obj.setBuildYear(2023);
		obj.setAvg(38);
		obj.setEnginePower(220);
		obj.setFuelType("Pertol");
		obj.setTopspeed(180);
		obj.setNumberOfSeats(2);
		
//		
//		System.out.println(obj.getModelName());
//		System.out.println(obj.getBuildYear());
//		System.out.println(obj.getEnginePower());
//		System.out.println(obj.getFuelType());
//		System.out.println(obj.getBreakType());
//		System.out.println(obj.getAvg());
//		System.out.println(obj.getTopspeed());
//		System.out.println(obj.getNumberOfSeats());
//		System.out.println(obj.getStuent());
		
		obj.show();
	}

}
