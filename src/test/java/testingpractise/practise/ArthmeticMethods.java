package testingpractise.practise;

//import org.junit.Test;

public class ArthmeticMethods {
	ArthmeticData ad=new ArthmeticData();
	int num3;
	void add()
	{
	   num3=ad.num1+ad.num2;
	   System.out.println("addition of num1 and num2 is " +num3);
	   
	}
	void subtraction()
	{
		num3=ad.num1-ad.num2;
		System.out.println("subtraction of num1 and num2 is " +num3);
	}
	void division()
	{
		num3=ad.num1/ad.num2;
		System.out.println("division of num1 and num2 is " +num3);
	}
	void moduloDivison() 
	{
		num3=ad.num1%ad.num2;
		System.out.println("modulodivison of num1 and num2 is " +num3);
		
	}

}
