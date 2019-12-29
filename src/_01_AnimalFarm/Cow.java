package _01_AnimalFarm;

public class Cow extends Animal {

	@Override
	void makeNoise() {
		System.out.println("COW NOISE! mOO ");		
	}

	@Override
	void custom() {
		System.out.println("COW's custom method: mooing");
	}

}
