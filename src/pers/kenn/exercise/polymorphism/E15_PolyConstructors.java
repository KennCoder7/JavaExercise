package pers.kenn.exercise.polymorphism;

class E15_Pokemon {
	void say() {
		System.out.println("Pokemon say()");
	}
	E15_Pokemon(){
		System.out.println("Pokemon() before say()");
		say();
		System.out.println("Pokemon() after say()");
	}
}

class E15_Pikachu extends E15_Pokemon {
	private String s = "hello";
	E15_Pikachu(String ss){
		s = ss;
		System.out.println("Pikachu() " + s);
	}
	void say() {
		System.out.println("Pikachu say() " + s);
	}
}
/**Exercise 15.
 * Polymorphism in constructors.
 * @author Kenn
 *
 */
public class E15_PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E15_Pikachu("pikapika");
	}

}
