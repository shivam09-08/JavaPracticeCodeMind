package SpringContext;

public class Benifits {
	int dinnerVoucher;
	int gameVoucher;
	String healthCheckup;
	String insurance;
	public int getDinnerVoucher() {
		return dinnerVoucher;
	}
	public int getGameVoucher() {
		return gameVoucher;
	}
	public String getHealthCheckup() {
		return healthCheckup;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setDinnerVoucher(int dinnerVoucher) {
		this.dinnerVoucher = dinnerVoucher;
	}
	public void setGameVoucher(int gameVoucher) {
		this.gameVoucher = gameVoucher;
	}
	public void setHealthCheckup(String healthCheckup) {
		this.healthCheckup = healthCheckup;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	@Override
	public String toString() {
		return "Benifits [dinnerVoucher=" + dinnerVoucher + ", gameVoucher=" + gameVoucher + ", healthCheckup="
				+ healthCheckup + ", insurance=" + insurance + "]";
	}
	
	

}
