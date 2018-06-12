package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력하세요.(0: 종료)");

			String tmp = scanner.nextLine();
			int a = Integer.parseInt(tmp);

			if(a==0) {
				System.out.println("프로그램 종료");
				break;

			}else if(a>0) {
				System.out.println("positive integer");
			}else if(a<0) {
				System.out.println("negative number");
			}

		}

	}

}
