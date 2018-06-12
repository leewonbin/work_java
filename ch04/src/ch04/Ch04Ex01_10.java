package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.nextLine();
		String num1 = scanner.nextLine();
		
		int a = Integer.parseInt(num);
		int b = Integer.parseInt(num1);
		
		if(a<b) {
			System.out.println(b-a);
		}else if (a>b) {
			System.out.println(a-b);
		}
	}

}
