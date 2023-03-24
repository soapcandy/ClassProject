package Task.Ch4;

import java.util.Scanner;

public class Q01_IfReit {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");
		
		int num = 0;
		num = in.nextInt();
		
        if(num>0 && (num%2==0)) {
        	
        	System.out.println("양수이면서 짝수");
          
        }
        else {
        	System.out.println("양수가 아니거나 짝수가 아닌 수");
        }
		

	}

}
