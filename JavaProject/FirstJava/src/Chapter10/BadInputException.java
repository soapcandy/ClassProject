package Chapter10;

public class BadInputException extends Exception {
	
	BadInputException(String string) {
		super("사용자의 입력값이 올바르지 않습니다");
	}

}
