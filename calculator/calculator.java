import java.util.*;
class calculator
{
	private int no1, no2;
	public void getvalue()
	{
		System.out.println("Enter the value of No1: ");
		Scanner sc= new Scanner(System.in);
		no1 = sc.nextInt();
		System.out.println("Enter the value of No2: ");
		no2 = sc.nextInt();
	}
	public void clear()
	{
		no1 = 0;
		no2 = 0;
	}
	public int addition()
	{
		int sum;
		sum = no1 + no2;
		return(sum);
	}
	public int substraction()
	{
		int difference;
		difference = no1 - no2;
		return(difference);
	}
	public int multiplication()
	{
		int product;
		product = no1 * no2;
		return(product);
	}
	public int division()
	{
		int quotient;
		quotient = no1/no2;
		return(quotient);
	}
	public int remainder()
	{
		int remainder;
		remainder = no1%no2;
		return(remainder);
	}

class call()
{
	public static void main(String[] args)
	{
		char op;
		int result;
		calculator call = new calculator();
		call.getvalue();
		Scanner sc = new Scanner(System.in);
		op=sc.next();
		if(op=='+')
		{
			result = call.addition();
			System.out.println("Addition result: " + result);
		}
		else if(op=='-')
		{
			result = call.substraction();
			System.out.println("Substraction result: " + result);
		}
		else if(op=='*')
		{
			result = call.multiplication();
			System.out.println("Multiplication result: " + result);
		}
		else if(op=='/')
		{
			result = call.division();
			System.out.println("Quotient result: " + result);
		}
		else
		{
			result = call.remainder();
			System.out.println("Remainder result: " + result);
		}
	}
}
}