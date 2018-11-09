package pers.kenn.exercise.reusing;
/**Exercise 4.
 * 
 * @author Kenn
 *
 */
public class E04_Cartoon extends Art {

	public E04_Cartoon() {
		System.out.println("Cartoon construction");
	}
	private void draw() {
		System.out.println("Drawing cartoon");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E04_Cartoon().draw();
	}

}
