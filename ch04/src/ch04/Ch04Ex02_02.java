package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String num = scanner.nextLine();
		int a = Integer.parseInt(num);
		int i = 1;
		int sum = 0;
		
		while (i<=a) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
