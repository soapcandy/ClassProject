package Task.Ch06;

public class Q01_ArrayExam1 {

	public static void main(String[] args) {
		
		//국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.
		
		// 같은 타입만 사용 가능 int 계산에 String 사용 불가
//		String[] sName = {"A", "B"};
		
		// 1차원 배열: 과목 등등이 변동되거나 수정되면 사용이 힘듬
		int[] kor = {100, 80, 60, 40, 80, 50, 60, 90, 40, 100};
		int[] eng = {70, 40, 80, 90, 90, 60, 80, 60, 90, 70};
		int[] math = {60, 80, 69, 100, 30, 40, 90, 90, 50, 80};
		
		System.out.println("국어 \t영어 \t수학 \t 총점 \t 평균");
//		for(int i=0; i<10; i++) {
//			int sum = kor[i] + eng[i] + math[i];
//			float avg = sum/3f;
//			System.out.println(kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + sum + "\t" + avg);
//		}
		
		// 2차원 배열
		int[][] scores = {
				{10, 50, 90},
				{20, 60, 100},
				{30, 70, 10},
				{40, 80, 20},
				{50, 90, 30},
				{60, 100, 40},
				{70, 10, 50},
				{80, 20, 60},
				{90, 30, 70},
				{100, 40, 80}
		};

		for(int i=0; i < scores.length; i++) {
			int sum = 0;
			for(int j=0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
			}
			System.out.print(sum + "\t");
			System.out.print(sum/(float)scores[i].length);
			System.out.println();
		}
	}

}
