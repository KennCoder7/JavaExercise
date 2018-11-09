package pers.kenn.exercise.control;
import static net.mindview.util.Print.*;
/**A method that detects and prints prime number.
 * Exercise 4.
 * 
 * @author Kenn
 *
 */
public class E04_detectPrimeNumber {

	static boolean ExactDivision(int x, int y){
		if((x % y) == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		for(int i = 1 ; i < 101 ; i ++) {
			flag = 0;
			for(int j = 1 ; j < i ; j++) {
				if( (j != 1) && (ExactDivision(i, j)))
					flag++;
			}
			if(flag == 0)
				print("(" + i +") is prime number.");
		}
	}

}
