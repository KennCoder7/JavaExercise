package pers.kenn.exercise.iniandcleanup;
/**Exercise 22.
 * 
 * @author Kenn
 *
 */
public class E22_EnumInSwitch {

	public enum PaperCurrencyTypes {
		ONE, TWO, FIVE, TEN, TWENTY, FIVETY
	}
	
	PaperCurrencyTypes type;
	
	public E22_EnumInSwitch(PaperCurrencyTypes type) {
		this.type = type;
	}
	
	public void describe() {
		System.out.print("The value of the paper currency is ");
		switch(type) {
		case ONE:	System.out.println("$1"); break;
		case TWO:	System.out.println("$2"); break;
		case FIVE:	System.out.println("$5"); break;
		case TEN:	System.out.println("$10"); break;
		case TWENTY:	System.out.println("$20"); break;
		case FIVETY:	System.out.println("$50"); break;
		default:	System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E22_EnumInSwitch 
			ob1 = new E22_EnumInSwitch(PaperCurrencyTypes.ONE),
			ob2 = new E22_EnumInSwitch(PaperCurrencyTypes.FIVE);
		
		ob1.describe();
		ob2.describe();
	}

}
