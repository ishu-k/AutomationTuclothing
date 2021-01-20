package testingpractise.practise;

public class TestDataMain {

	public static void main(String[] args) {
		int c;
		TestData td=new TestData();
		c=td.a+td.b;
		System.out.println(c);
		int milligrams;
		milligrams =(td.kilograms)*1000000;
		System.out.println("kilograms to milligrams"+ milligrams);
		float grams=td.kilograms*1000;
		System.out.println("Kilograms to Grams conversion :"+grams);
		float meter=td.kilometer*1000;
		System.out.println("Kilometer To Meter conversion :" +meter);
		double celcius=((td.fahrenheit-32)*5)/9;
		System.out.println("Temperature in celicus :" +celcius);
		int milliliters=td.litre*1000;
		System.out.println("liters to Milliliter conversion :"+milliliters);
		float centimeters=td.meter*100;
		System.out.println("meter to centimeter conversion :"+centimeters);
		float kilometer=td.meter1/1000;
		System.out.println("meter to kilometer conversion :"+kilometer);
		float kilograms=td.milligrams/1000000;
		System.out.println("milligrams To Kilograms :" +kilograms);
		int liter=td.milliliter/1000;
		System.out.println("milliliter to liter conversion :"+liter);
		double  fahrenheit=((td.celcius*9)/5)+32;
		System.out.println("Temperature in fahrenheit:"+fahrenheit);



		

	}

}
