package Chapter08.phone;

public class SmartPhone2 extends Computer implements Phone {

	boolean power; // false

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println(number1 + number2 + number3 + "에 전화를 합니다");

	}

	@Override
	public void turnON() {
		System.out.println("전원을 켭니다");
		if (!power) {
			// 전원이 꺼져있으면 킨다
			power = true;
		}
	}

	@Override
	public void turnOFF() {
		System.out.println("전원을 끕니다");
		if (power) {
			// 전원이 켜져 있으면 끈다
			power = false;
		}
	}

}
