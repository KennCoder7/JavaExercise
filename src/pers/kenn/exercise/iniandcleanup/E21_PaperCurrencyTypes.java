package pers.kenn.exercise.iniandcleanup;
/**Exercise 21.
 * 
 * @author Kenn
 *
 */
public class E21_PaperCurrencyTypes {
	public enum PaperCurrencyTypes {
		ONE, TWO, FIVE, TEN, TWENTY, FIVETY
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
			System.out.println(s.ordinal() + ": " + s);
	}

}
