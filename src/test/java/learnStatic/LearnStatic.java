package learnStatic;

public class LearnStatic
{
	
	static int a = 0;
	int b = 0;
	
	void getCounter()
	{
		a++;
		b++;
		
		System.out.println("static " + a + " nonstatic " + b);
		
	}

	public static void main(String args[])
	{
		LearnStatic ls = new LearnStatic();
		ls.getCounter();
		ls.getCounter();
		ls.getCounter();
		
		LearnStatic ls1 = new LearnStatic();
		ls1.getCounter();
	}
}
