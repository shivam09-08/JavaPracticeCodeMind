package MultiLevelInheritance;

public class GrandChild extends Child{
	
	String pet;
	String Certifications;
	public String getPet() {
		return pet;
	}
	public String getCertifications() {
		return Certifications;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public void setCertifications(String certifications) {
		Certifications = certifications;
	}
	
	public void GrandChildInfo()
	{
		System.out.println(" Name of Parent is : " +name+" ,  Surname is : " + surname+ "Occupation is : " +jobType+" ,  Colour of SkinTone is :" + skinTone);
		System.out.println (" Body Type is : " +bodyType+ " , Language knows : " +nativeLanguage+ " , Colour of eyes is : " + eyeColour+ " , Type of property is : " + PropertyType);
		System.out.println(" Total Childer : " +numberOfChild+ " , Highest Education is : " +educationLevel+ " , certifications in : " +Certifications+ " , Pet Animal is : " + pet);
	}
	
	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.setBodyType("Average");
		obj.setCertifications("karate, cricket,Cloud");
		obj.setJobType("Developer");
		obj.setName("Karan");
		obj.setNativeLanguage("Hindi,English,French");
		obj.setNumberOfChild(0);
		obj.setPet("Dog");
		
		obj.GrandChildInfo();
	}

}
