package Chapter05.phone;

public class MemberMain {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone();
		
		Member member1 = new Member("손흥민", "son@gmail", 20, "010-1111-9999", smartPhone);
		Member member2 = new Member("박지성", "park@gmail");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
		dataPrint(member1); // 매개변수의 인자 -> Member 타입 인스턴스를 가르키는 주소값
		dataPrint(member2);
		
	}
	
	static void dataPrint(Member member) {
		// Member member = member1
		// Member member: 매개변수, 참조변수
		
		member.showData();
		
	}
	
}
