package Task.Ch1;

public class Calculator {

	public static void main(String[] args) {
	
		System.out.println(add(20, 10));
		System.out.println(sub(20, 10));
		System.out.println(mul(20, 10));
		System.out.println(div(20, 10));

	}
	
	static int add(int num1, int num2) {
		
		int sum;
		sum = num1 + num2;
		
		return sum;
	}
	
	static int sub(int num1, int num2) {
		
		int sum;
		sum = num1 - num2;
		
		return sum;
	}
	
	static int mul(int num1, int num2) {
		
		int sum;
		sum = num1 * num2;
		
		return sum;
	}
	
	static int div(int num1, int num2) {
		
		int sum;
		sum = num1 / num2;
		
		return sum;
	}

}
