import java.util.*;

public class Calculator {
	
	String name1;
	String name2;
	String name3;
	String ID1;
	String ID2;
	String ID3;
	String URI="https://github.com/jeongQ/ener.git";
	public Calculator(String a1, String a2, String a3, String ID1, String ID2, String ID3, String URI)
	{
		a1 = "Jeon Joon Hyung";
		a2 = "Kang Jeong Kyu";
		a3 = "Kang Ho Hyung";
		ID1 = "jeonjoonhyung";
		ID2 = "HHKANG";
		ID3 = "jeongQ";
		URI = "https://github.com/jeongQ/ener.git";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hi");
	}
	public double add(double x, double y)
	{
		double result=0;
		result = x + y;
		return result;
	}
	public double subtract(double x, double y)
	{
		return 0;
	}
	public double multiply(double x, double y)
	{
		double result=0;
		result = x*y;
		return result;
	}
	public double divide(double x, double y)
	{
		return 0;
	}
	

}
