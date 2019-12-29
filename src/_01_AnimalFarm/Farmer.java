package _01_AnimalFarm;

import java.util.ArrayList;

public class Farmer {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow cow= new Cow();
		Dog dog= new Dog();
		Horse horse= new Horse();
		Pig pig= new Pig();
		
		farm.add(cow);
		farm.add(dog);
		farm.add(horse);
		farm.add(pig);
		for(int i=0; i<farm.size(); i++){
			farm.get(i).makeNoise();
			farm.get(i).custom();
		}
		
	}

}
