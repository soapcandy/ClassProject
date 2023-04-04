package Task.Ch06;

public class Q02_Student {

//	① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//	② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//	③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.

	// 변수 정의
	private String name;
	private int kor;
	private int math;
	private int eng;


	// 초기화
	public Q02_Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	// 여분
	public Q02_Student() {
	
	}


	// 캡슐화
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	// 총점
	private int sum() {
		return kor + math + eng;
	}

	// 평균
	private float avg() {
		return sum()/3f;
	}
	
	public String result() {
		return name + "\t" + kor + "\t" + math + "\t" + eng +"\t" + sum() + "\t" + avg();
	}

	@Override
	public String toString() {
//		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		return result();
	}

}
