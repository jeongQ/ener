import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		return 0;
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
		str = n1 + " "+ n2 + " "+ n3 + " "+ i1 + " "+ i2
				+ " "+ i3+ " "+ URL;
		return str;
	}
}

