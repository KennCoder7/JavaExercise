package pers.kenn.exercise.iniandcleanup;
/**Exercise 12.
 * 
 * @author Kenn
 *
 */
public class E12_Tank {
	boolean condition = false;
	
	E12_Tank(boolean ft) {
		condition = ft;
		//true = filled, false = emptied 
	}
	
	void empty() {
		condition = false;
	}
	
	protected void finalize() {
		if(condition)
			System.out.println("Error");
		else
			System.out.println("OK");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E12_Tank(true);
		new E12_Tank(true).empty();
		System.gc();
	}

}
