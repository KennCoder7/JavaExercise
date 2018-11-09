package pers.kenn.exercise.reusing;

class AA {
	public AA(int i) {
		System.out.println("AA constructor");
	}
}

class BB {
	public BB(int i) {
		System.out.println("BB constructor");
	}
}

class CC extends AA {
	public CC() {
		super(1);
		// TODO Auto-generated constructor stub
		System.out.println("CC constructor");
	}

	public BB bb = new BB(1);
}
/**Exercise 7.
 * 
 * @author Kenn
 *
 */
public class E07_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CC();
	}

}
