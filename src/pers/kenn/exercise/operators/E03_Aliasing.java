package pers.kenn.exercise.operators;
import static net.mindview.util.Print.*;

class Letter {
	float x;
}

/**A method that demonstrates alising during methods call.
 * 
 * @author Kenn
 * @version 1.0
 */

public class E03_Aliasing {
	static void f(Letter b) {
		b.x = 11.28f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter a = new Letter();
		a.x = 19.94f;
		print("1: a.x = " + a.x);
		f(a);
		print("2: a.x = " + a.x);
	}

}
