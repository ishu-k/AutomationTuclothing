package testingpractise.practise;

public class PrimeNumberPrinting {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=100;i++)
		{
			//System.out.println("numbers "+i);
        boolean isPrime=true;
		for(j=2;j<=i-1;j++)
		{
			if(i%j==0)
			{
			 isPrime=false;
				break;
			}
				
		}
		if(isPrime==true)
		{
		System.out.println("prime numbers"+i);
		}
		}
	}
}

			

