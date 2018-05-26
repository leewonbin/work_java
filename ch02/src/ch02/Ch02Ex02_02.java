package ch02;

import java.util.Scanner;

public class Ch02Ex02_02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("%d", num);

}
}