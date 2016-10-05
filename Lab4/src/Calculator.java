import java.util.*;
public class Calculator {
	String n1;
	String n2;
	String n3;
	String i1;
	String i2;
	String i3;
	String URL;
	public Calculator(String num1, String num2, String num3, String id1, String id2, String id3, String url)
	{
		n1 = num1;
		n2 = num2;
		n3 = num3;
		i1 = id1;
		i2 = id2;
		i3 = id3;
		URL = url;
		
	}
	
	public double add(double x, double y)
	{
		double result=0;
		result = x + y;
		return result;
	}
	public double subtract(double x, double y)
	{
		double sub;
		sub = x-y;
		
		return sub;
	}
	public double multiply(double x, double y)
	{
		double result = x * y;
		return result;
	}
	public double divide(double x, double y)
	{
		double div;
		if(y == 0){
			System.out.println("division can't zero");
			return 0;
		}
		div = x/y;
		
		return div;
	}
	public int remainder(double x, double y){
		int rem;
		rem = (int)(x%y);
		
		return rem;
	}
	
	public String toString()
	{
		String str;
		str = n1 + " "+ i1 + "\n"+ n2 + " "+ i2 + "\n"+ n3
				+ " "+ i3+ "\n"+ URL;
		return str;
	}
}

