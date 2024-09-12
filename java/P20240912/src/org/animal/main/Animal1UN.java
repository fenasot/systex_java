package org.animal.main;

import org.animal.model.Animal;
import org.animal.model.Cat;
import org.animal.model.Dog;
import org.animal.model.Pet;
import org.animal.model.米國人;

public class Animal1UN {
	public static void main(String[] args) {
//		Animal d = new Animal();
//		Animal c = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		c.move();
		d.speak();
		上台發言(c);
		上台發言(d);
		雙邊會談(c, d);
		
		米國人 a = new 米國人(); 
		多邊會談(a, d, c);
		
		Pet.foo();
		d.baz();
		d.bar();
		
	}

	public static void 上台發言(Animal a) {
		a.speak();
	}
	
	public static void 雙邊會談(Animal a1, Animal a2) {
		a1.speak();
		a2.speak();
	}
	
	public static void 多邊會談(Animal... animals) {
		for(Animal a: animals) {
			a.speak();
		}
	}
	
}
