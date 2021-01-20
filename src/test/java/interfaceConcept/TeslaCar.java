package interfaceConcept;

public class TeslaCar implements Car{
	int a=10,b=20;

	public void breaks() {
		System.out.println("this car got breaks");
	}

	public void wheels() {
		System.out.println("This car has 4 wheels");
	}

	public void steering() {
		System.out.println("This car got steering");	
	}

	public void gear() {
		System.out.println("This car got gears");
	}

	public void price() {
	   System.out.println("this car price -£70000");
		
	}

}
