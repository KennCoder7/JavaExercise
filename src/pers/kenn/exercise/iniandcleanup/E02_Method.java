package pers.kenn.exercise.iniandcleanup;
/**A method that achieve exercise 2.
 * 
 * @author Kenn
 *
 */
public class E02_Method {
	String a = "abc";
	String b;
	E02_Method(String s){
		b = s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E02_Method ob = new E02_Method("def");
		System.out.println(ob.a);
		System.out.println(ob.b);
	}

}
