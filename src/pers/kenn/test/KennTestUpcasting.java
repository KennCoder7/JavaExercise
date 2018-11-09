package pers.kenn.test;

class KTPokemon {
	void say() {
		System.out.println("hello");
	}
}

class KTPikachu extends KTPokemon {
	void say() {
		System.out.println("pikapika");
	}
	
	void thunder() {
		System.out.println("Electric Shock");
	}
}

public class KennTestUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KTPokemon ob = new KTPikachu(); //Upcasting
		ob.say();
		// ! ob.thunder();
		((KTPikachu) ob).thunder();
		
		KTPokemon ob2 = new KTPokemon();
		ob2.say();
		((KTPikachu) ob2).say();
	}

}
