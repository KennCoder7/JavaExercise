package pers.kenn.exercise.control;
/**A method that prints finbonacci number
 * 
 * @author Bruce Eckel, Kenn
 *
 */
public class E09_Fibonacci {
	static int fib(int x) {
		if(x < 3)
			return 1;
		else 
			return (fib(x-2) + fib(x-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 5;
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i <= n; i++)
			System.out.print(fib(i) + ", ");
	}

}
