package pers.kenn.exercise.polymorphism;
import static net.mindview.util.Print.*;

class Rodent {
	public void move() {
		print("Robent moving");
	}
	public void reproduce() {
		print("Making more robents");
	}
	public String toString() {
		return("Rodent");
	}
}

class Mouse extends Rodent {
	public void move() {
		print("Mouse moving");
	}
	public void reproduce() {
		print("Making more mice");
	}
	public String toString() {
		return("Mouse");
	}
}

class Gerbil extends Rodent {
	public void move() {
		print("Gerbil moving");
	}
	public void reproduce() {
		print("Making more gerbils");
	}
	public String toString() {
		return("Gerbil");
	}
}

class Hamster extends Rodent {
	public void move() {
		print("Hamster moving");
	}
	public void reproduce() {
		print("Making more hamsters");
	}	
	public String toString() {
		return("Hamster");
	}
}
/**Exercise 9.
 * 
 * @author Kenn
 *
 */
public class E09_Rodent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rodents = {
				new Mouse(),
				new Gerbil(),
				new Hamster(),
		};
		
		for(Rodent s : rodents) {
			print(s);
			s.move();
			s.reproduce();
		}
	}

}
