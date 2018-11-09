package pers.kenn.exercise.object;
/**This method tells you how many bytes are required to hold the information in a string.
 * This method is exercise 6, page 37.
 * @author Bruce Eckel
 * @author Kenn
 * @version 1.0
 */
public class E06_Storage {
	String s = "";
	int storage(String s) {
		return s.length() * 2;
	}
	void Print()
	{
		System.out.println(storage(s));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E06_Storage ob = new E06_Storage();
		ob.s = "Hello, World!";
		ob.Print();
	}

} 
