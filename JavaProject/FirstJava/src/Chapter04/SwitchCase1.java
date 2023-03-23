package Chapter04;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		
		int score = 91;
		
		// 점수별 학점 체크
		
		// score / 10 -> 100:A, 99~90:B, ....
		
		switch (score/10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
			
		default:
			System.out.println("F");
			break;
		}
		
		
		
		int key = 60;
		
		switch (key) {
		case 10: // key == 10
			System.out.println("10 입니다.");
			break; // 감싸고 있는 블록 탈출
			
		case 20:
			System.out.println("20 입니다.");
			break;

		default:
			System.out.println("10 또는 20이 아닌 숫자 입니다.");
			break;
		}

	}

}
