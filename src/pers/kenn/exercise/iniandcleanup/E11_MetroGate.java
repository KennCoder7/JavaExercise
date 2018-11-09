package pers.kenn.exercise.iniandcleanup;
/**Exercise 11.
 * 
 * @author Kenn
 *
 */
public class E11_MetroGate {
	boolean Enter = false;
	E11_MetroGate(boolean ft) {
		Enter = ft;
		//System.out.println("Enter");
	}
	void leaving() {
		Enter = false;
		//System.out.println("Leaving");
	}
	protected void finalize() {
		if(Enter) {
			System.out.println("Error: somebody did not leave");
			//super.finalize();
		}
		else
			System.out.println("All is well");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E11_MetroGate(true).leaving();
		System.gc();
	}

}
