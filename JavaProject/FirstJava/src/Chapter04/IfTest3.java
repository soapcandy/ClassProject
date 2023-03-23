package Chapter04;

public class IfTest3 {

	public static void main(String[] args) {
		
		// 다중 if ~ else if ~ else 구문을 사용하여 아래의 요구 작성
		// 점수가 90점 이상인 경우 A를 출력하고, 80점이상 90점 미만의 경우 B 그 이하는 C를 출력
		
		int score = 70;
		
		if(score >= 90) {
			System.out.println("A");
		}
		
		else if (score >= 80) {
			System.out.println("B");
		} 
		
		else {
			System.out.println("C");
		}
		
		
	}

}
