package pers.kenn.exercise.reusing;

import pers.kenn.test.Pokemon;
/**Exercise 15.
 * 
 * @author Kenn
 *
 */
public class E15_Bulbasaur extends Pokemon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pokemon obb = new Pokemon();
		//obb.prime();//Error coz protected
		E15_Bulbasaur ob = new E15_Bulbasaur();
		ob.prime();
	}

}
