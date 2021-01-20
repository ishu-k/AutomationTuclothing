package interfaceConcept;

public class InterfaceImplementation {

	public static void main(String[] args) {
		TeslaCar teslacar=new TeslaCar();
		teslacar.breaks();
		teslacar.wheels();
		teslacar.steering();
		teslacar.gear();
		teslacar.price();
		int c=teslacar.a+teslacar.b;
		System.out.println(c);
		BmwCar bmwcar=new BmwCar();
		bmwcar.price();
		bmwcar.breaks();
		bmwcar.steering();
		bmwcar.gear();
		Car car=new TeslaCar();
		car.breaks();
		car.gear();
		car.steering();
		car.wheels();

	}

}
