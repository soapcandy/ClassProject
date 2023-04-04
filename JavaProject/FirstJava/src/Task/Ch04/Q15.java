package Task.Ch04;

public class Q15 {

	public static void main(String[] args) {

		int n = 1;
				
		switch (n) {
		
		case 1: {
			
			System.out.println("현재 인원은 1명 입니다.");
			break;
			
		}
		case 2: {
			
			System.out.println("현재 인원은 2명 입니다.");
			break;
		}
		case 3: {
			
			System.out.println("현재 인원은 3명 입니다.");
			break;
		}
		default:
			
			System.out.println("현재 많은 사람들이 있습니다.");
		
		}
		
// -----------------------------------------------------------		
		System.out.println();
		
		if (n==1) {
			
		System.out.println("현재 인원은 1명 입니다.");
		
		}
		else if (n==2) {
		
			System.out.println("현재 인원은 2명 입니다.");
		
		}
		else if (n==3) {
			
			System.out.println("현재 인원은 3명 입니다.");
			
		}
		
		else System.out.println("현재 많은 사람들이 있습니다.");
		
	}

}
