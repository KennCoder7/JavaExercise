package pers.kenn.exercise.control;
import java.util.*;
/**Write a program to generate 25 random int  
 * values. Use an if-else statement for each value  
 * to classify it as greater than, less than, or  
 * equal to a second randomly generated value. 
 * 
 * @author Bruce Eckel
 */ 
public class E02_RandomInts {
	static Random rand = new Random();
	public static void compareRand() {
		int a = rand.nextInt(10);
		int b = rand.nextInt(10);
		System.out.println("a = " + a + ", b = " + b);
		if(a < b)       
			System.out.println("a < b");     
		else if(a > b)       
			System.out.println("a > b");     
		else       
			System.out.println("a = b"); 
	}
	public static void main(String[] args) {     
		for(int i = 0; i < 25; i++)       
			compareRand();   
	} 
}
