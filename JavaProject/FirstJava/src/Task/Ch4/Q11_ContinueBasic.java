package Task.Ch4;

public class Q11_ContinueBasic {

	public static void main(String[] args) {
		
        int count=0;
        for(int num = 1; num <= 100; num++) {
//            if(num%5!=0 || num%7!=0)
//            continue;
            
        if(num%5==0 && num%7==0) {    
            System.out.println(num);
            count++;
        }
        }
        System.out.println("count: " + count);
        
	}

}
