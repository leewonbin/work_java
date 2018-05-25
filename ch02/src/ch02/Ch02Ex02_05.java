package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	
	public static void main(String[] args) {
		// 1. 정수 하나 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 개의 숫자를 입력하시오.>");
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		float num2 = Float.parseFloat(input2);
		
		System.out.printf("%d * %f = %f", num1, num2, num1*num2);
		// 2. 실수 하나 입력 받기
		
		// 3. 정수와 실수 곱한 값 새로운 변수에 저장
		
		// 4. 출력 예와 동일하게 출력하기
		
	}

}
