package methodOverloading;

public class SumOverloading {
	//call by reference
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of a,b is " +c);
		return c;
	}
	public double sum(int x,double d,double e)
	{
		double z1=x+d+e;
		System.out.println("sum of x,y,z is " +z1);
		return z1;
	}

}
