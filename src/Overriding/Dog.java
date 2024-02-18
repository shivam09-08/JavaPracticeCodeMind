package Overriding;

public class Dog extends Animal {

	

	void printSound(String soundMaking )
	{
		
		this.soundMaking=soundMaking;
		
		System.out.println("Dog make a sound like :" + soundMaking);
	}
	public static void main(String[] args) {
		Animal obj = new Dog();

		obj.setAnimalType("Domasticanimal");
		obj.setFavFood("bones");
		obj.setLifeSpane(20);
		obj.setName("Scoobydoo");
		obj.setSkinType("soft");
		obj.printSound("Howl");
		obj.info();
	}
}
