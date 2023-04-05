package Task.Ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Chapter11.MyClass;

public class FootballPlayerSet<T> {

	// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수
	// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	String name;
	int number;
	String team;
	int age;

	// 변수, 메소드의 반환타입, 매개변수의 타입
	T val;

	public FootballPlayerSet(T val) {
		super();
		this.val = val;
	}

	public FootballPlayerSet() {
		super();
	}

	T getVal() {
		return val;
	}

	void setVal(T val) {
		this.val = val;
	}

	public static void main(String[] args) {

		FootballPlayerSet<String> player = new FootballPlayerSet<String>();
		player.setVal("손흥민");
		System.out.println(player.getVal());
	}

}
