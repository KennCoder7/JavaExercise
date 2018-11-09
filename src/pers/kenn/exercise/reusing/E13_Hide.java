package pers.kenn.exercise.reusing;
class Prime {
	void func(int i) {
		System.out.println("Prime func(int i)");
	}
	
	/*void func(float f) {
		// TODO Auto-generated method stub
		System.out.println("Prime func(float f)");
	}*/

	void func(char c) {
		System.out.println("Prime func(char c)");
	}
	
	void func(String s) {
		System.out.println("Prime func(String s)");
	}
}
/**Exercise 13.
 * 
 * @author Kenn
 *
 */
public class E13_Hide extends Prime{
	void func(float f) {
		System.out.println("func(float f)");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E13_Hide ob = new E13_Hide();
		ob.func(1);
		ob.func('c');
		ob.func("abc");
		ob.func(1.1f);
	}

}
