package pers.kenn.exercise.control;
import static net.mindview.util.Print.*;
import java.util.*;
/**A method that generates 25 random int values, then compares each value with the one next to it.
 * 
 * @author Kenn
 * @version 2.0
 */
public class E02_Method2 {
	
	int[] num = new int[25];
	Random rand = new Random();
	
	public void generate() {
		for(int i = 0 ; i < 25 ; i++)
			num[i] = rand.nextInt(10);	
	}
	
	public void compare(int i) {
		if(num[i] < num[i+1])
			print((i+1) + ": The number ( " + num[i] + " ) is less than the next number ( " + num[i+1] + " ).");
		else if(num[i] == num[i+1])
			print((i+1) + ": The number ( " + num[i] + " ) is equal to the next number ( " + num[i+1] + " ).");
		else
			print((i+1) + ": The number ( " + num[i] + " ) is greater than the next number ( " + num[i+1] + " ).");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_Method2 ob = new E02_Method2();
		ob.generate();
		for(int i = 0 ; i < 24; i++)
			ob.compare(i);	
	}

}
