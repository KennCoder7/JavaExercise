package pers.kenn.exercise.operators;
import static net.mindview.util.Print.*;
class Tank {
	float level;
}
/**A method that demonstrates aliasing.
 * @author Kenn
 * @version 1.0
 */
public class E02_Aliasing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 1.1f;
		t2.level = 2.2f;
		print("1: t1.level = " + t1.level + ", t2.level = " + t2.level);
		t1 = t2;
		print("2: t1.level = " + t1.level + ", t2.level = " + t2.level);
		t1.level = 3.3f;
		print("3: t1.level = " + t1.level + ", t2.level = " + t2.level);
	}

}
