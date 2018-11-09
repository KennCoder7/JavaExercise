package pers.kenn.exercise.polymorphism;

import static net.mindview.util.Print.*;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		print("Creating " + this);
	}
	public void addRef() { refcount++; }
	protected void dispose() {
		if(--refcount == 0)
			print("Disposing " + this);
	}
	protected void finalize() {
		print("print shared.finalize()");
		if(refcount != 0)
			print("Error: object is not properly cleaned-up!");
	}
	public String toString() { return "Shared " + id; }
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
  protected void dispose() {
	  print("disposing " + this);
	  shared.dispose();
  }
  public String toString() { return "Composing " + id; }
}
/**Exercise 13.
 * 
 * @author Bruce Eckel, Kenn
 *
 */
public class E13_ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for(Composing c : composing)
			c.dispose();
		System.gc();
		/* Kenn's question:
		 * composing[0].dispose();
		 * System.gc();
		 * output: no Error warn(shared.finalize())
		 * */
		new Composing(new Shared());
		System.gc();
	}
} 
