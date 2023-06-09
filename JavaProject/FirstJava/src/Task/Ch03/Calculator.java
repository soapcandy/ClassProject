package Task.Ch03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요. >>");
		long num1 = in.nextLong();
		System.out.println("두번째 숫자를 입력하세요. >>");
		long num2 = in.nextLong();
		System.out.println("연산의 결과 =======");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);

		System.out.println();
		System.out.println("반지름 길이를 입력하세요. >>");
		double r = in.nextDouble();

		System.out.println("원의둘레 : " + cal1(r));
		System.out.println("원의넓이 : " + cal2(r));

	}

	// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	static void add(long num1, long num2) {

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}

	//	② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	static void sub(long num1, long num2) {

		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	}
	
	//	③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	static void mul(long num1, long num2) {

		System.out.println(num1 + "X" + num2 + "=" + (num1 * num2));
	}
	
	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	static void div(float num1, float num2) {

		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
	}
	
	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 
	//  반환하는 메소드를 정의
	static double cal1(double r) {
		// 2 x π x r
		return 2 * Math.PI * r;
	}

	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 
	// 반환하는 메소드를 정의 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	static double cal2(double r) {
		// π x r x r
		return Math.PI * r * r;
	}
}
