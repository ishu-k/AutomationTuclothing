package testingpractise.practise;

public class AlcoholAgeRestriction {

	public static void main(String[] args) {
		int age=23;
		if(age<18)
		{
			System.out.println("dont sell alcohol");
		}
		else if(age>=18&age<24)
		{
			System.out.println("sell alcohol with id ");
		}
		else if(age>=25)
		{
			System.out.println("sell alcohol without id");
		}

	}

}
