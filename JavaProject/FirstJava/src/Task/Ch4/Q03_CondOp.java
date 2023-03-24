package Task.Ch4;

public class Q03_CondOp {

	public static void main(String[] args) {
		
		int num1=50, num2=100;
		int big = 0;
		int diff = 0;		
        
        if(num1>num2) {
        	big = num1;	
        }
        else {
        	big = num2;
        }

        if(num1>num2) {
        	diff = num1-num2;
        }
        else {
        	diff = num2-num1;
        }
		System.out.println(big);
		System.out.println(diff);
	}

}
