package Overriding;

public class Cat extends Animal {


	void printSound(String soundMaking )
	{
		
		this.soundMaking=soundMaking;
		
		System.out.println("Cat make a sound like :" + soundMaking);
	}
	public static void main(String[] args) {
		Animal obj = new Cat();

		obj.setAnimalType("Domasticanimal");
		obj.setFavFood("Milk");
		obj.setLifeSpane(18);
		obj.setName("snowbell");
		obj.setSkinType("soft");
		obj.printSound("meow");
		obj.info();
	}
}
