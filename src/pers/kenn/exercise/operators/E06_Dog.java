package pers.kenn.exercise.operators;
import static net.mindview.util.Print.print;
/**A method that demonstrates exercise 6.
 * Addition:Override the function "equals()".
 * @author Kenn
 */
public class E06_Dog {
	String name;
	String says;
	
	E06_Dog(String s,String l){
		name = s;
		says = l;
	}
	
	boolean equals(E06_Dog dog) {
		if((name == dog.name) && (says == dog.says))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06_Dog DogA = new E06_Dog("Spot","Ruff!");
		E06_Dog DogB = new E06_Dog("Scruffy","Wurf!");
		E06_Dog DogC = new E06_Dog("Spot","Ruff!");
		print("DogA == DogB: " + (DogA == DogB));
		print("DogA == DogC: " + (DogA == DogC));
		print("DogA.equals(DogB): " + DogA.equals(DogB));
		print("DogA.equals(DogC): " + DogA.equals(DogC));
	}

}