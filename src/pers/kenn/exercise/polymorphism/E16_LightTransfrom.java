package pers.kenn.exercise.polymorphism;

class Light {
	void lightUp() {	}
	public String toString() {
		return "Light";
	}
}

class YellowLight extends Light {
	void lightUp() {
		System.out.println("Yellow Light");
	}
	public String toString() {
		return "YellowLight";
	}
}
	
class RedLight extends Light {
	void lightUp() {
		System.out.println("Red Light");
	}
	public String toString() {
		return "RedLight";
	}
}

class GreenLight extends Light {
	void lightUp() {
		System.out.println("Green Light");
	}
	public String toString() {
		return "GreenLight";
	}
}

class TrafficLight {
	private Light light = new YellowLight();
	void lightTrans(boolean ft) {
		if(ft)
			light = new GreenLight();
		else
			light = new RedLight();
	}
	void lightTrans() {
		if(light.toString() == "YellowLight")
			light = new RedLight();
		else if(light.toString() == "GreenLight")
			light = new YellowLight();
		else 
			light = new GreenLight();
	}
	void lightShow() {
		light.lightUp();
	}
}
/**Exercise 16.
 * 
 * @author Kenn
 *
 */
public class E16_LightTransfrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight ob = new TrafficLight();
		ob.lightShow();
		ob.lightTrans();
		ob.lightShow();
		ob.lightTrans();
		ob.lightShow();
	}

}
