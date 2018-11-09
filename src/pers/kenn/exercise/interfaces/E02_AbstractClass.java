package pers.kenn.exercise.interfaces;

abstract class AClass {
	private int a = 0;
	AClass(){
		a = 1;
	}
	void printClass() {
		System.out.println(a);
	}
}
/**Exercise 2.
 * Can not instantiate abstract class.
 * @author Kenn
 *
 */
public class E02_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//!new AClass();
	}

}
