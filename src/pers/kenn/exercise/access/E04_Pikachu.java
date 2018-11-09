package pers.kenn.exercise.access;
import pers.kenn.test.*;
/**Exercise 4.
 * Key word: extends, protected
 * @author Kenn
 *
 */
public class E04_Pikachu extends Pokemon {
	public E04_Pikachu() {
		System.out.println("Pikachu constructor");
	}
	public void evolution() {
		super.evolution();
		System.out.print(" ---> ");
		System.out.print("Pikachu");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E04_Pikachu ob = new E04_Pikachu();
		ob.say("Pikachu");
		ob.evolution();
		//ob.prime();
	}

}
