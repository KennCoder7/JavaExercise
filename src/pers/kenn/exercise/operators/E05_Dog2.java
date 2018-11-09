package pers.kenn.exercise.operators;
import static net.mindview.util.Print.print;
/**The method of exercise 5.
 * @author Kenn
 *
 */
public class E05_Dog2 {
	String name;
	String says;
	
	E05_Dog2(String s,String l){
		name = s;
		says = l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06_Dog DogA = new E06_Dog("Spot","Ruff!");
		E06_Dog DogB = new E06_Dog("Scruffy","Wurf!");
		print("The DogA's name is: " + DogA.name);
		print("The DogA's says is: " + DogA.says);
		print("The DogB's name is: " + DogB.name);
		print("The DogB's says is: " + DogB.says);
	}

}
