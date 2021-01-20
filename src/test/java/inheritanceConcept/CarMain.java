package inheritanceConcept;

public class CarMain {

	public static void main(String[] args) {
		BmwCar bmwcar=new BmwCar();
		bmwcar.breaks();
		bmwcar.gear();
		bmwcar.name();
		bmwcar.steering();
		bmwcar.wheels();
		AudiCar audicar=new AudiCar();
		audicar.color();
		audicar.breaks();
		audicar.gear();
		audicar.wheels();
		audicar.steering();
		Teslacar teslacar=new Teslacar();
		teslacar.autopilot();
		teslacar.breaks();
		teslacar.gear();
		teslacar.steering();
		teslacar.wheels();
		AudiCarA1 audicara1=new AudiCarA1();
		audicara1.breaks();
		audicara1.price();
		audicara1.gear();
		audicara1.model();
		audicara1.color();
		AudiA3 audia3=new AudiA3();
		audia3.breaks();
		audia3.color();
		audia3.model();
		audia3.steering();
		AudiA4 audia4=new AudiA4();
		audia4.model();
		audia4.color();
		audia4.gear();
		audia4.steering();
		TeslaModelS teslamodels=new TeslaModelS();
		teslamodels.autopilot();
		teslamodels.breaks();
		teslamodels.model();
		teslamodels.price();
		teslamodels.steering();
		TeslaModelX teslamodelx=new TeslaModelX();
		teslamodelx.autopilot();
		teslamodelx.model();
		teslamodelx.price();
		TeslaModel3 teslamodel3=new TeslaModel3();
		teslamodel3.autopilot();
		teslamodel3.breaks();
		teslamodel3.model();
		teslamodel3.price();
		teslamodel3.steering();
		BmwX1 bmwx1=new BmwX1();
		bmwx1.gear();
		bmwx1.price();
		bmwx1.steering();
		bmwx1.model();
		
		
		

	}

}
