package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
	
		double a = (double)(num+num1+num2)/3;
		
		
		System.out.printf("%.1f",a);
	}

}
