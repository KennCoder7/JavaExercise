package pers.kenn.exercise.reusing;

class Amphibian {
	private String st;
	Amphibian(String s){
		st = s;
	}
	void cry() {
		System.out.println(st);
	}
	static void say(Amphibian ob) {
		ob.cry();
	}
}
/**Exercise 16.
 * key word: Upcasting
 * @author Kenn
 *
 */
public class E16_Frog extends Amphibian {
	E16_Frog(String s) {
		super(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E16_Frog frog = new E16_Frog("aaaaaa!");
		Amphibian.say(frog); // Upcasting
	}

}
