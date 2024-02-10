package MultiLevelInheritance;

public class Parent {
	String name ="vinit";
	String surname = "Kumar";
	String bodyType="Average";
	String jobType="Farmer";
	String nativeLanguage="Hindi";
	String eyeColour="Brown";

	String PropertyType="Farm";
	String skinTone="Fair";
	
	public String getName() {
		return name;
	}
	public String getJobType() {
		return jobType;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	
	public String getSurname() {
		return surname;
	}
	public String getBodyType() {
		return bodyType;
	}
	public String getNativeLanguage() {
		return nativeLanguage;
	}
	public String getEyeColour() {
		return eyeColour;
	}
	public String getPropertyType() {
		return PropertyType;
	}
	public String getSkinTone() {
		return skinTone;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	public void setPropertyType(String propertyType) {
		PropertyType = propertyType;
	}
	public void setSkinTone(String skinTone) {
		this.skinTone = skinTone;
	}
	
	public void parent()
	{
		System.out.println(" Name of Parent is : " +name+" ,  Surname is : " + surname+ " , Occupation is : " +jobType+ " ,  Colour of SkinTone is :" + skinTone);
		System.out.println (" Body Type is : " +bodyType+ " , Language knows : " +nativeLanguage+ " , Colour of eyes is : " + eyeColour+ " , Type of property is : " + PropertyType);
		
	}
	
	public static void main(String[] args) {
		Parent obj = new Parent();
		//obj.setBodyType("Average");
		//obj.setEyeColour("Brown");
		//obj.setJobType("Farmer");
		//obj.setName("Vinit");
		//obj.setNativeLanguage("Hindi");
		//obj.setPropertyType("Farm");
		//obj.setSkinTone("Fair");
		//obj.setSurname("Yadav");
		
		obj.parent();
	}

}
