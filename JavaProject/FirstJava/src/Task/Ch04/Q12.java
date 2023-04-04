package Task.Ch04;

public class Q12 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		while(true) {
			num++;
			if((num%2 == 1) || ((num%3 == 0 && num%2 == 0))) {
					sum += num;		
//					System.out.println(num);
//					System.out.println(sum);
			}
			if(sum>1000) {
				break;
			}
		}
		System.out.println(num + "를 더했을 때 1000을 넘어섭니다");
		System.out.println("넘어선 값은" + sum + "입니다");

	}

}
