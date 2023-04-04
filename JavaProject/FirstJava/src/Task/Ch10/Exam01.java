package Task.Ch10;

import java.util.Scanner;

import Chapter10.BadInputException;

public class Exam01 {

	public static void main(String[] args) {

//		1. 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요");
		String str = sc.nextLine();

		try {

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
//				 ① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
				if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
					BadIdInputException e = new BadIdInputException("영문자 혹은 숫자로만 이루어진 값 입력.");
					throw e;
				}
			}

		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());

		}
	}

//	② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
	public static class BadIdInputException extends Exception {

		BadIdInputException(String string) {
			super("사용자의 입력값이 올바르지 않습니다");
		}

	}
}
