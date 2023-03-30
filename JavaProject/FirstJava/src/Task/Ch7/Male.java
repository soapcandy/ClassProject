package Task.Ch7;

public class Male extends Person {
	
	String gender;

	public Male(String name, int number) {
		super(name, number);

	}
	
	void game() {
		System.out.println(gender + "게임을 합니다.");
	}

	@Override
	void call() {
		super.call();
	}

	
	
}
