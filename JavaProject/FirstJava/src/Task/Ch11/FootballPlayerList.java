package Task.Ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballPlayerList {

	// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
	String name;
	int number;
	String team;
	int age;
	
	public static void main(String[] args) {
		
		Scanner playerName = new Scanner(System.in);
		System.out.println("선수의 이름을 입력하세요");
		String str = playerName.nextLine();
		
		List<String> player = new ArrayList<String>();
		
		// 인스턴스 저장
		player.add(str);
		
		// 데이터 참조: get()
		String name = player.get(0);
		System.out.println(name);
		
	}
	
}
