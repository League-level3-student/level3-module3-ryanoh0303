package _01_AnimalFarm;

public class Dog extends Animal{

	@Override
	void makeNoise() {
		System.out.println("DoG NOISE : BARk");
	}

	@Override
	void custom() {
		System.out.println("Dog's custom method barking");
	}

}
