package Task.Ch7;

public class Female extends Person {
	
	String gender;

	public Female(String name, int number) {
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
