package pers.kenn.exercise.control;
import static net.mindview.util.Print.*;
/**NOT accomplish
 * 
 * @author Kenn
 *
 */
public class E10_Vampire {

	static void vampire(int n) {
		String s = String.valueOf(n);
		
		if(s.length() == 4) {
			
			char[] ch = s.toCharArray();
			int[] num = new int[s.length()];
			for(int i = 0; i < s.length(); i++) {
				num[i] =(int)ch[i] - 48;
				//print(num[i]);
			}			
			
			for(int a = 0; a < 4; a++) {
				for(int b = 0; b < 3; b++) {
					for(int c = 0; c < 2; c ++) {
						//if(((num[a]*10) + num[b]) )
					}
				}
			}
			
		}
		
		else
			print("The number of digits isn't four.");

		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vampire(12345);
	}

}
