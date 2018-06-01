package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//값을 받고
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		//값을 저장
		double num = Double.parseDouble(input);
		double num1 = Double.parseDouble(input1);
		double c = num * num1;
		//double형을 int형으로 형변환
		int a = (int)num;
		int b = (int)num1;
		int d = (int)c;
		
		
		System.out.printf("%d %d", d, a * b);
		
	}

}
