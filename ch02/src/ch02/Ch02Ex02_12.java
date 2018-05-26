package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num = Integer.parseInt(input1);
		float num1 = Float.parseFloat(input2);
		
		System.out.printf("%.2f*%d=%.0f",num1,num,num1*num);
}
}