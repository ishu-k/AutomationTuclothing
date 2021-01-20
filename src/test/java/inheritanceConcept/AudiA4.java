package inheritanceConcept;

public class AudiA4 extends AudiCar {
    void model()
    {
    	System.out.println("This is A4 model Audi Car");
    }
	
	  void steering()
	  //method overriding creating child class method with the same name of parent class
	  //during the output this method override the parent class method 
	  { 
		  System.out.println("this is Audi4 steering "); }
	 
}
