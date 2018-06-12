package ch04;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		int a = Integer.parseInt(num);
		while(i<=a) {
			System.out.println(i);
			i++;
		}
	
	}

}
