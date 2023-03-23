package Task;

public class Q13 {

	public static void main(String[] args) {
		
		
		 for(int i = 1; i < 9; i++) {
		    	
		    	if(i % 2 == 0 && i != 6) {
		    		
		    		for(int j = 1; j <= i; j++) {
		    			System.out.print(i + " x " + j + " = " + j * i + "\t");
		    		}
		    		System.out.println();
		    	}
		    }

	}

}
