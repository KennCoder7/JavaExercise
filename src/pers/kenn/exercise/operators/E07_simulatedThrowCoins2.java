package pers.kenn.exercise.operators;
import java.util.*;
import static net.mindview.util.Print.*;
/**A method that simulates the throw of coins.
 * Exercise 7.
 * @author Kenn
 * @version 2.0
 */
public class E07_simulatedThrowCoins2 {

	boolean flip;
	String ThrowCoins() {
		Random rand = new Random();
		flip = rand.nextBoolean();
		return flip ? "Head." : "Tail";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E07_simulatedThrowCoins2 frist = new E07_simulatedThrowCoins2();
		E07_simulatedThrowCoins2 second = new E07_simulatedThrowCoins2();
		E07_simulatedThrowCoins2 third = new E07_simulatedThrowCoins2();
		print("The result of frist throw: " + frist.ThrowCoins());
		print("The result of second throw: " + second.ThrowCoins());
		print("The result of third throw: " + third.ThrowCoins());
	}

}