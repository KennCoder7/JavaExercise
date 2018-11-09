package pers.kenn.exercise.operators;
//import  static net.mindview.util.Print.*;
/**The method of exercise 5.
 * The method is failed.(Syntax Wrong)
 * @author Kenn
 *

public class E05_Dog {
	static String name;//shouldn't use "static"
	static String says;
	
	E05_Dog(String s,String l){
		E05_Dog.name = s;//shouldn't add "E05_Dog."
		E05_Dog.says = l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E05_Dog DogA = new E05_Dog("Spot","Ruff!");
		E05_Dog DogB = new E05_Dog("Scruffy","Wurf!");
		print("The DogA's name is: " + DogA.name );
		print("The DogA's says is: " + DogA.says);
		print("The DogB's name is: " + DogB.name);
		print("The DogB's says is: " + DogB.says);
	}

}
 */