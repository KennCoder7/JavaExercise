package pers.kenn.exercise.reusing;
//import pers.kenn.*;
import pers.kenn.exercise.access.E04_Pikachu;
/**Exercise 2.
 * Key word: Inheritance
 * @author Kenn
 *
 */
public class E02_Raichu extends E04_Pikachu {
	public E02_Raichu()	{
		System.out.println("Raichu constructor");
	}
	public void evolution() {
		super.evolution();
		System.out.print(" ---> ");
		System.out.print("Raichu");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_Raichu ob = new E02_Raichu();
		ob.say("Raichu");
		ob.evolution();
	}

}
