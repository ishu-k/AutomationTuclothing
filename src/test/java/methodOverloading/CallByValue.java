package methodOverloading;

public class CallByValue {
	public int sum(int x,int y)
	{
		int z=x+y;
		System.out.println("sum of x and y is " +z);
		return z;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("subtraction of a,b" +c);
		return c;
	}

}
