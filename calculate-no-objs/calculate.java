public class calculate
{
	public static void main(String args[])
	{
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		obj3.count();
	}
}

class Counter
{
	static int i;
	public Counter()
	{
		i++;
	}
	public void count()
	{
		System.out.println("The number of objects in class are - " + i);
	}
}