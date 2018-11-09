package pers.kenn.exercise.iniandcleanup;
/**Exercise 9.
 * 
 * @author Kenn
 *
 */
public class E09_This {
	int a = 0;
	String b = "defalut";
	E09_This(int x) {
		a = x;
		System.out.println("do : a = ");
	}
	E09_This() {
		this(7);
		b = "kenn";
		System.out.println("do : b = ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E09_This ob = new E09_This();
		System.out.println(ob.a);
		System.out.println(ob.b);
	}

}
