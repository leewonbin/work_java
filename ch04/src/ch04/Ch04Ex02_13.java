package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		int h = Integer.parseInt(input1);
		int y = Integer.parseInt(input2);

		for(int i = 1;i<=h;i++) {
			for(int j = 1;j<=y;j++) {

				System.out.print(i*j+" ");



			}System.out.println();

		}
	}
}







