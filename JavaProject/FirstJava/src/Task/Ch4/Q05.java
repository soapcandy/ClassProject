package Task.Ch4;

public class Q05 {

	public static void main(String[] args) {
		
		int num = 300;
		
		if(num < 0) {
			System.out.println("0미만");
		}
		else {
			switch (num/100) {
			case 0:
				System.out.println("0이상 100미만");
				break;
			case 1:
				System.out.println("100이상 200미만");
				break;
			case 2:
				System.out.println("200이상 300미만");
				break;

			default:
				System.out.println("300이상");
				break;
			}
		}
		
		
		

	}

}
