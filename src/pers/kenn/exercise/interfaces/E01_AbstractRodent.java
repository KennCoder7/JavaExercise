package pers.kenn.exercise.interfaces;

import static net.mindview.util.Print.print;

abstract class Rodent {
	public abstract void move();
	public abstract void reproduce();
	public String toString() {
		return("Rodent");
	}
}

class Mouse extends Rodent {
	public void move() {
		print("Mouse moving");
	}
	public void reproduce() {
		print("Making more mice");
	}
	public String toString() {
		return("Mouse");
	}
}

class Gerbil extends Rodent {
	public void move() {
		print("Gerbil moving");
	}
	public void reproduce() {
		print("Making more gerbils");
	}
	public String toString() {
		return("Gerbil");
	}
}

class Hamster extends Rodent {
	public void move() {
		print("Hamster moving");
	}
	public void reproduce() {
		print("Making more hamsters");
	}	
	public String toString() {
		return("Hamster");
	}
}
/**Exercise 1.
 * Abstract class. 
 * @author Kenn
 *
 */
public class E01_AbstractRodent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
