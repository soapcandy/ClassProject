package Chapter03;

public class Operator11 {

	public static void main(String[] args) {


		char c = 'A';
		int num = 10;
		
		System.out.println(c > 10); // char > int 연산은 int > int 로 바뀐다
		System.out.println('1' > '0'); // char > char 연산은 int > int 로 바뀐다
		System.out.println(num == 10f); // int == float 연산은 float == float으로 바뀐다

	}

}
