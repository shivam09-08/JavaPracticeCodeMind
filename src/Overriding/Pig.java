package Overriding;

public class Pig  extends Animal {

	void printSound(String soundMaking )
	{
		
		this.soundMaking=soundMaking;
		
		System.out.println("Pig make a sound like :" + soundMaking);
	}
	public static void main(String[] args) {
		Animal obj = new Pig();

		obj.setAnimalType("Wild");
		obj.setFavFood("FoodWaste");
		obj.setLifeSpane(12);
		obj.setName("Pigtail");
		obj.setSkinType("Hard");
		obj.printSound("Oink");
		obj.info();
	}

}
