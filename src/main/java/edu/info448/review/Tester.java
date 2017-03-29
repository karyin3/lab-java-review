package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));
		//Dog.bark();
		
		Husky husky = new Husky("Dubs");
		husky.bark();

		husky.pullSled();
		//dog.pullSled();
		husky.hug();

		Dog v1 = new Husky("Dubs");
		//Husky v2 = new Dog();
		Huggable v2 = new Husky("Spot");
		Huggable v3 = new TeddyBear();
		//Husky v4 = new TeddyBear();

		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky("Spot")); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!

		//enhanced for loop ("foreach" loop)
		//read: "for each Huggable in the hugList"
		for(Huggable thing : hugList) {
			thing.hug();
		}

		//Animal a1 = new Animal();
		GiftBox<Husky> huskyGiftBox = new GiftBox<Husky>(husky);
	}
}