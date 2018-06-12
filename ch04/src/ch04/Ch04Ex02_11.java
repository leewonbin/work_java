package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Base = 0;
		int Height = 0;


		while (true) {
			System.out.print("Base =");
			Base = Integer.parseInt(scanner.nextLine());
			System.out.print("Height =");
			Height = Integer.parseInt(scanner.nextLine());
			System.out.printf("Triangle area = %.1f%n",Height*Base/2.0);
			System.out.print("Continue?");
			String con = scanner.nextLine();
			// 만약 "Y"나 "y"를 입력했다면, continue; 실행
			if (con.equals("Y")||con.equals("y")) {
			
				continue;
			}else {
				break;


			}

			// 그 외의 문자열을 입력했다면, break; 실행
		}


	}
}