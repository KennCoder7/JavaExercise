package pers.kenn.exercise.polymorphism;

class Bicycle1 {
	void discribe() {
		System.out.println(wheel() + "-wheels Cycle");
	}
	int wheel() {
		return 2;
	}
}

class Tricycle1 extends Bicycle1 {
	int wheel() {
		return 3;
	}
}
/**Exercise 10.
 * 
 * @author Kenn
 *
 */
public class E10_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle1 ob = new Tricycle1();
		ob.discribe();
	}

}
