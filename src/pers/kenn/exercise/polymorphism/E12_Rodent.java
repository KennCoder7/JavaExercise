package pers.kenn.exercise.polymorphism;
import static net.mindview.util.Print.print;

class say {
	public say(String s) {
		print("SAY: " + s);
	}
}
class Rodent2 {
	say s1 = new say("ahh!");

	public Rodent2() {
		print("Rodent2 constructor");
	}
	say s2 = new say("ohh!");
	public void move() {
		print("Robent moving");
	}
	public void reproduce() {
		print("Making more robents");
	}
	public String toString() {
		return("Rodent");
	}
}

class Mouse2 extends Rodent2 {
	say s1 = new say("Mahh!");
	say s2 = new say("Mohh!");
	public Mouse2() {
		print("Mouse2 constructor");
	}
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
/**Exercise 12.
 * 
 * @author Kenn
 *
 */
public class E12_Rodent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mouse2();
	}

}
