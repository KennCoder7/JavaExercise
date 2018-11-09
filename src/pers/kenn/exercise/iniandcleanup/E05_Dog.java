package pers.kenn.exercise.iniandcleanup;
/**Exercise 5.
 * 
 * @author Kenn
 *
 */
public class E05_Dog {
	E05_Dog() {
		System.out.println("barking");
	}
	E05_Dog(int x) {
		System.out.println("howling");
	}
	E05_Dog(float y) {
		System.out.println("ahhh");
	}
	E05_Dog(double z) {
		System.out.println("ennn");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E05_Dog();
		new E05_Dog(1);
		new E05_Dog(1.1f);
		new E05_Dog(1.1);
	}

}
