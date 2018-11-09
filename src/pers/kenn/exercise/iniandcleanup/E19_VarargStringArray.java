package pers.kenn.exercise.iniandcleanup;
/**Exercise 19.
 * 
 * @author Kenn
 *
 */
public class E19_VarargStringArray {
	static void f(String... strings) {
		for(String s : strings)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f("abc", "def", "ghi");
		f(new String[] {"abc","def","ghi"});
	}

}
