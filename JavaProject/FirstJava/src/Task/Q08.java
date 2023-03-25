package Task;

public class Q08 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		while(num <= 1000) {
			while(num%2 == 0) {
				while(num%7 == 0) {
					System.out.println(num);
					sum += num;
					num++;
				}
				num++;
			}
			num++;
		}
		System.out.println("합: " + sum);
	}

}
