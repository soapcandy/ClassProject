package Chapter04;

public class IfTest2 {

	public static void main(String[] args) {
		
		
		//점수가 60점 이상인 경우에는 "PASS"를 출력하고, 60점 미만인 경우 "FAIL"을 출력하는 프로그램 만들기
		
		int score;
		score = 50;
		
		if(score >= 60) {
			System.out.println("PASS");
		}
		
		else {
			System.out.println("FAIL");
		}
		
		
		int age = 20;
		
		if(age > 19) {
			System.out.println("투표가 가능합니다.");
		}
		else {
			System.out.println("아직 투표권이 없습니다.");
		}
		
		
		// 짝수/홀수 판단 프로그램
		
		int num1 = 10;
		
		if(num1%2 == 1) {
			//나머지가 1
			System.out.println("홀수");
		}
		else {
			//나머지가 0
			System.out.println("짝수");
		}
	}

}
