package pers.kenn.test;
/**Simplification of System.out.println()
 * import static pers.kenn.test.Kennprint.*;
 * @author Kenn
 * @version 1.0
 */
public class Kennprint {
	
	public static void kennprintln(String...strings) {
		for(String s : strings)
			System.out.print(s);
		System.out.println();
	}
	public static void kennprintln(int...is) {
		for(int i : is)
			System.out.print(i);
		System.out.println();
	}
	public static void kennprintln(double...ds) {
		for(double d : ds)
			System.out.print(d);
		System.out.println();
	}
	

}
