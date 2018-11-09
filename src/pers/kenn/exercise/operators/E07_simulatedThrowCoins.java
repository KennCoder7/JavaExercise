package pers.kenn.exercise.operators;
import java.util.*;
import static net.mindview.util.Print.*;
/**A method that simulates the throw of coins.
 * Exercise 7.
 * @author Kenn
 * @version 1.0
 */
public class E07_simulatedThrowCoins {

	int i,j;
	String ThrowCoins() {
		Random rand = new Random();
		i = rand.nextInt(100);
		j = rand.nextInt(100);
		while(i == j) {
			j = rand.nextInt(100);
		}
		if (i > j)
			return "Head.";
		else 
			return "Tail.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E07_simulatedThrowCoins frist = new E07_simulatedThrowCoins();
		E07_simulatedThrowCoins second = new E07_simulatedThrowCoins();
		E07_simulatedThrowCoins third = new E07_simulatedThrowCoins();
		print("The result of frist throw: " + frist.ThrowCoins());
		//print(frist.i);print(frist.j);
		print("The result of second throw: " + second.ThrowCoins());
		print("The result of third throw: " + third.ThrowCoins());
	}

}
