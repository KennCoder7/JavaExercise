package pers.kenn.exercise.interfaces;
import pers.kenn.test.Vehicle;

class Car implements Vehicle {

	@Override
	public void wheel(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + "-wheels vehicle");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this + " move()");
	}

	@Override
	public void setSpeed(double d) {
		// TODO Auto-generated method stub
		System.out.println("set speed: " + d);
	}
	
	public String toString() {
		return "Car";
	}
}
/**Exercise 5.
 * interface and implements
 * @author Kenn
 *
 */
public class E05_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car();
		ob.move();
	}

}
