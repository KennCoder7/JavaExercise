package pers.kenn.exercise.polymorphism;
class Cycle {
	void ride() {
		System.out.println("Ride cycle");
	}
}

class Unicycle extends Cycle {
	Unicycle(){
		System.out.println("Unicycle constructor");
	}
	void ride() {
		System.out.println("Ride unicycle");
	}
}

class Bicycle extends Cycle {
	Bicycle(){
		System.out.println("Bicycle constructor");
	}
	void ride() {
		System.out.println("Ride bicycle");
	}
}

class Tricycle extends Cycle {
	Tricycle(){
		System.out.println("Tricycle constructor");
	}
	void ride() {
		System.out.println("Ride tricycle");
	}
}
/**Exercise 1.
 * key word: Upcasting, Polymorphism
 * 
 * @author Kenn
 *
 */
public class E01_RideCycle {

	static void ride(Cycle ob) {
		ob.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle uni = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		
		Cycle uni2 = new Unicycle();
		
		// ! Unicycle uni3 = new Cycle();
		
		ride(uni);
		ride(bi);
		ride(tri);
		
		ride(uni2);
		
		
	}

}
