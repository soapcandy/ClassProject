package Task.Ch7;

public class Person {
	
	private String name;
	private int number;
	
	public Person(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	void call() {
		System.out.println( "안녕하세요. 저는 " + name + "입니다. " + number + "살 입니다.");
	}
	
}


