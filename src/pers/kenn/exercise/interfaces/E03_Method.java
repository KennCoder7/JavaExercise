package pers.kenn.exercise.interfaces;

abstract class Aprint{
	Aprint(){
		System.out.println("Aprint constructor");
		print();
	}
	abstract void print();
}

class Bprint extends Aprint {
	int i = 1;
	void print() {
		System.out.println("Bprint i: " + i);
	}
}
/**Exercise 3.
 * 
 * @author Kenn
 *
 */
public class E03_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bprint ob = new Bprint();
		ob.print();
	}

}
