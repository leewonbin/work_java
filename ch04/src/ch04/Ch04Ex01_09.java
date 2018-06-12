package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		int result,result1,result2; 
		
		Scanner scanner = new Scanner(System.in);
		String a1 =scanner.nextLine();
		String b2 =scanner.nextLine();
		String c3 =scanner.nextLine();
		
		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b2);
		int c = Integer.parseInt(c3);
		
		result = (a>b) ? a : b;
		result1 = (a>c) ? a : b;
		result2 = (b<c) ? b : c;
		
		if (true) {
			System.out.println(result);
		} else if (true)
			System.out.println(result1);
	

		}
			
	}
