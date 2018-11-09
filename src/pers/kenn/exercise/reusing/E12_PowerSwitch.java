package pers.kenn.exercise.reusing;

class Device {
	Device(String i){
		System.out.println("Device Constructor " + i);
	}
	void dispose() {
		System.out.println("Device dispose");
	}
}

class AirConditioner extends Device {
	AirConditioner(String i){
		super(i);
		System.out.println("AirConditioner Constructor");
	}
	void dispose() {
		System.out.println("Switch off AirConditioner");
		super.dispose();
	}
}

class Light extends Device {
	Light(String i){
		super(i);
		System.out.println("Light Constructor");
	}
	void dispose() {
		System.out.println("Switch off Light");
		super.dispose();
	}
}
/**Exercise 12.
 * 
 * @author Kenn
 *
 */
public class E12_PowerSwitch extends Device {
	private AirConditioner a;
	private Light b;
	E12_PowerSwitch(String i){
		super(i);
		a = new AirConditioner("AC");
		b = new Light("L");
		System.out.println("PowerSwitch Constructor");
	}
	
	void dispose() {
		System.out.println("All switch off");
		a.dispose();
		b.dispose();
		super.dispose();
	}
	
	void PowerStatus(boolean ft) {
		if(ft)
			System.out.println("Runing...");
		else
			System.out.println("Error!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E12_PowerSwitch ob = new E12_PowerSwitch("PS");
		try {
			//ob.PowerStatus(true);
			//System.exit(0);
			ob.PowerStatus(false);
		} 
		finally {
			ob.dispose();
		}
	}

}
