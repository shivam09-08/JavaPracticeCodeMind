package MultiLevelInheritance;

public class Child extends Parent{

	
	String educationLevel;
	int numberOfChild;
	
	public String getEducationLevel() {
		return educationLevel;
	}

	public int getNumberOfChild() {
		return numberOfChild;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public void setNumberOfChild(int numberOfChild) {
		this.numberOfChild = numberOfChild;
	}
	
	public void ChildInfo()
	{
		System.out.println(" Name of child is : " +name+" ,  Surname is : " + surname+ " , Occupation is : " +jobType+" ,  Colour of SkinTone is :" + skinTone);
		System.out.println (" Body Type is : " +bodyType+ " , Language knows : " +nativeLanguage+ " , Colour of eyes is : " + eyeColour+ " , Type of property is : " + PropertyType);
		System.out.println(" Total Childer : " +numberOfChild+ " , Highest Education is : " +educationLevel);
	}

	

	public static void main(String[] args) {
		Child obj =new Child();
		obj.setBodyType("Athlete");
		obj.setEyeColour("Brown");
		obj.setJobType("Cricketer");
		obj.setName("Rinku");
		obj.setNativeLanguage("Hindi,English");
		//obj.setPropertyType("Farm");
		//obj.setSkinTone("Fair");
		//obj.setSurname("Yadav");
		obj.setEducationLevel("BSC");
		obj.setNumberOfChild(2);
		
		obj.ChildInfo();
	}
	
}
