package pers.kenn.exercise.interfaces;

abstract class E04ClassA {
	
}

class E04ClassB extends E04ClassA {
	void discribe() {
		System.out.println("CLass B discribe()");
	}
}

abstract class E04ClassAa {
	abstract void discribe();
}

class E04ClassBb extends E04ClassAa {
	void discribe() {
		System.out.println("CLass Bb discribe()");
	}
}
/**Exercise 4.
 * 
 * @author Kenn
 *
 */
public class E04_Method {
	static void func1(E04ClassA ob) {
		((E04ClassB) ob).discribe();//need downcast
	}
	
	static void func2(E04ClassAa ob) {
		ob.discribe();//don't need downcast
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E04ClassA ob1 = new E04ClassB();
		func1(ob1);
		
		E04ClassAa ob2 = new E04ClassBb();
		func2(ob2);
	}

}
