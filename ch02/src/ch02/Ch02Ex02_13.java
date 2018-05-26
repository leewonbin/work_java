package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		int num4 = 20+50+100;
		int num5 = num4 / 3;
		
		System.out.printf("sum = %d%n",num4);
		System.out.printf("avg = %d",num5);
}
}