package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("점수 입력");
			String ko = scanner.nextLine();
			String ma = scanner.nextLine();
			String en = scanner.nextLine();
			int num1 = Integer.parseInt(ko);
			int num2 = Integer.parseInt(ma);
			int num3 = Integer.parseInt(en);
			
			int num4 = num1 + num2 + num3;
			int num5 = num4 / 3;
			
			System.out.println("kor " + num1);
			System.out.printf("mat %d%n", num2);
			System.out.printf("eng %d%n", num3);
			System.out.printf("sum %d%n", num4);
			System.out.printf("avg %d%n", num5);
	}

}
