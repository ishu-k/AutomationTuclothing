package methodOverloading;

public class CallByValueMain {

	public static void main(String[] args) {
		CallByValue callbyvalue=new CallByValue();
		int x=10,y=30;
		callbyvalue.sum(x, y);
		int a=70,b=50;
		callbyvalue.sub(a, b);
	}

}
