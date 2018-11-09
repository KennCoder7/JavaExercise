package pers.kenn.exercise.iniandcleanup;
/**Exercise 10.
 * A metro gate records enter and leaving. 
 * If somebody has not left, warn.
 * 
 * @author Kenn
 *
 */
public class E10_MetroGate {
	boolean Enter = false;
	E10_MetroGate() {
		Enter = true;
		System.out.println("Enter");
	}
	void leaving() {
		Enter = false;
		System.out.println("Leaving");
	}
	protected void finalize() {
		if(Enter) {
			System.out.println("Error: somebody did not leave");
			//super.finalize();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E10_MetroGate ob = new E10_MetroGate();
		//ob.finalize();
		ob.leaving();
		
		new E10_MetroGate();
		System.gc();
		
		
		
	}

}
