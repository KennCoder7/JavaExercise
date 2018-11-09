package pers.kenn.exercise.reusing;

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}
/**Exercise 6.
 * 
 * @author Kenn
 *
 */
public class E06_Chess extends BoardGame {

	E06_Chess() {
		super(1);
		// TODO Auto-generated constructor stub
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E06_Chess();
	}

}
