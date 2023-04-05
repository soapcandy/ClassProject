package Chapter11;

import Chapter08.Phone;
import Chapter08.SmartPhone;

public class GenericMethodByType2 {
	
	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요." + t.toString());
	}
	
	public static void main(String[] args) {
		GenericMethodByType2 byType = new GenericMethodByType2();
		
		SmartPhone p = new SmartPhone("010-1111-2222", "IOS");
		
//		byType.<String>introduce("1");
		byType.<SmartPhone>introduce(p);
		byType.introduce(p);

		
	}

}
