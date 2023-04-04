package Task.Ch06;

public class Q03_ArrayExam2 {

	public static void main(String[] args) {

//		① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//		② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//		③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다
		
		//Student 타입의 배열 생성: 데이터 10개 저장 가능
		Q02_Student[] students = new Q02_Student[10];
		students[0] = new Q02_Student("son01", 10, 50, 90);
		students[1] = new Q02_Student("son02", 20, 60, 100);
		students[2] = new Q02_Student("son03", 30, 70, 10);
		students[3] = new Q02_Student("son04", 40, 80, 20);
		students[4] = new Q02_Student("son05", 50, 90, 30);
		students[5] = new Q02_Student("son06", 60, 100, 40);
		students[6] = new Q02_Student("son07", 70, 10, 50);
		students[7] = new Q02_Student("son08", 80, 20, 60);
		students[8] = new Q02_Student("son09", 90, 30, 70);
		students[9] = new Q02_Student("son010", 100, 40, 80);
	
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================");
		
		for(Q02_Student student : students) {
			System.out.println(student.result());
		}
		// 세로 합 추가하기
	}

}
