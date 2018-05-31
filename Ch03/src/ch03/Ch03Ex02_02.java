package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		int a = num+5;
		int b = num1*2;
		
		System.out.printf("width=%d%n",a);
		System.out.printf("length=%d%n",b);
		System.out.printf("area=%d",a*b);
	}

}
