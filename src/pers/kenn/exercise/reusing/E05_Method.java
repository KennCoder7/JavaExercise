package pers.kenn.exercise.reusing;

class A {
	public A() {
		System.out.println("A construction");
	}
}

class B {
	public B() {
		System.out.println("B construction");
	}
}

class C extends A {
	public B b = new B();
}

/**Exercise 5.
 * 
 * @author Kenn
 *
 */
public class E05_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}
