package SpringContext;

public class Allowance {
	
	int houseRent ;
	int wifi;
	int cab;
	
	public int getHouseRent() {
		return houseRent;
	}
	public int getWifi() {
		return wifi;
	}
	public int getCab() {
		return cab;
	}
	public void setHouseRent(int houseRent) {
		this.houseRent = houseRent;
	}
	public void setWifi(int wifi) {
		this.wifi = wifi;
	}
	public void setCab(int cab) {
		this.cab = cab;
	}
	
	@Override
	public String toString() {
		return "Allowance [houseRent=" + houseRent + ", wifi=" + wifi + ", cab=" + cab + "]";
	}
	
	

}
