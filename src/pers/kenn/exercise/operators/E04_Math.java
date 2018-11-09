package pers.kenn.exercise.operators;
import static net.mindview.util.Print.*;

/**A method that calculates the value of velocity.
 * @author Kenn
 *
 */

public class E04_Math {
	static float V(float l,float t) {
		if(t == 0) return 0f;
		else return l / t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float l = 30f;
		print("The length is: " + l + " (m)");
		float t = 5.2f;
		print("The time is: " + t + " (s)");
		float v = V(l,t);
		print("The velocity is: " + v + " (m/s)");
	}

}
