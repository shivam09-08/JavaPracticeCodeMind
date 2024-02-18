package Overriding;

public class Animal {
	String name;
	String favFood;
	String soundMaking;
	String animalType;
	int lifeSpane;
	String skinType;
	
	
	public String getName() {
		return name;
	}
	public String getFavFood() {
		return favFood;
	}
	public String getSoundMaking() {
		return soundMaking;
	}
	public String getAnimalType() {
		return animalType;
	}
	public int getLifeSpane() {
		return lifeSpane;
	}
	public String getSkinType() {
		return skinType;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public void setSoundMaking(String soundMaking) {
		this.soundMaking = soundMaking;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public void setLifeSpane(int lifeSpane) {
		this.lifeSpane = lifeSpane;
	}
	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	void info()
	{
		System.out.println("Animal name : " +name+ ", Favroit Food : "+favFood);
		System.out.println("Animal type :" +animalType+ " , Animal life span : " +lifeSpane+ " , Animal Skin Type : "+skinType );
		
	}
	void printSound(String soundMaking )
	{
		
		this.soundMaking=soundMaking;
		
		System.out.println("Animal make a sound like :" + soundMaking);
	}
	public static void main(String[] args) {
		Animal obj = new Animal();
//		obj.setSoundMaking("baao");
		obj.printSound("baao");
		obj.info();
	}
	
}
