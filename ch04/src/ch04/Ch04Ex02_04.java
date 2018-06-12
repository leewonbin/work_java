package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		double avg= 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수를 입력하세요");	
			i = scanner.nextInt();

			if(i>=100) {
				sum += i;
				avg++;
				break;
			}else {
				sum +=i;
				avg++;


			}
		}
		System.out.println("합계 :"+sum);
		System.out.printf("평균 : %.1f",sum/avg);
	}

}
