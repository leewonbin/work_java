package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 가지 숫자 입력");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d%n", num1);
		System.out.printf("%d", num2);
		
		
}
}