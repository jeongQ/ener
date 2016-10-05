
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator("강정규", "전준형", "강호형", "201220919", "201221015", "201220918", "https://github.com/jeongQ/ener.git");
		
		
		
		System.out.println(cal.toString());
		System.out.println(cal.add(3, 4));
		System.out.println(cal.subtract(3, 4));
		System.out.println(cal.multiply(3, 4));
		System.out.println(cal.divide(3, 4));
		System.out.println(cal.remainder(3, 4));



	}

}
