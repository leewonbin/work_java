package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("height =");
	String input1 = scanner.nextLine();
	int num = Integer.parseInt(input1);
	
	System.out.printf("Your Height is %dcm",num);
}
}