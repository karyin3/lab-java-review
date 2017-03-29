package edu.info448.review;

public class Husky extends Dog implements Huggable {
    
    public Husky(String name) {
        super(name, "husky");
    }

    public void pullSled() {
        System.out.println("Pulllll");
    }

    public void bark() {
		System.out.println(this+" barks like a husky");
	}

    public void hug() {
        System.out.println("Give husky a big hug!");
    }
}