package pers.kenn.test;

public class Pokemon {
	//private String s;
	public Pokemon() {
		System.out.println("Pokemon constructor");
	}
	public void evolution() {
		System.out.print("Pokemon");
	}
	public void say(String s) {
		System.out.println("Hello master, I'm " + s);
	}
	protected void prime() {
		System.out.println("Prime");
	}

}
