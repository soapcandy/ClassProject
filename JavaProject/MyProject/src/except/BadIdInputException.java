package except;

public class BadIdInputException extends Exception {
	BadIdInputException(String string) {
		super("사용자의 입력값이 올바르지 않습니다");
	}
}
