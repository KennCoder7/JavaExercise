package pers.kenn.exercise.iniandcleanup;
/**Exercise 4
 * 
 * @author Kenn
 *
 */
public class E04_Method {
	E04_Method() {
		System.out.println("Exercise 4");
	}
	E04_Method(String s) {
		System.out.println("Exercise 4 constructor: " + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E04_Method();
		new E04_Method("Kenn");
	}

}
