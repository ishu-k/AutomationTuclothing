package testingpractise.practise;

public class StudentGrades {

	public static void main(String[] args) {
		int english=90,science=70,maths=90,computers=60,social=90,hindi=70,average,total;
		total=english+science+maths+computers+social+hindi;
		System.out.println("Total of 6 subjects :" +total);
		average=total/6;
		System.out.println("Average of 6 subjects :" +average);
		
	if(average<35)
	{
      System.out.println("student failed");
	}
	else if(average>=36&&average<50)
	{
		System.out.println("student passed in 3rd grade");
	}
	else if(average>=50&&average<60)
	{
		System.out.println("student passed in 2nd grade");
	}
	else if(average>=60&&average<75)
	{
		System.out.println("student passed in 1st grade");
	}
	else if (average>75)
	{
		System.out.println("student passed in distinction");
	}
		
}
}
