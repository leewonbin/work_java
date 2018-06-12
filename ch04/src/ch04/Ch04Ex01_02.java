package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" "); 		
		int cm = Integer.parseInt(tmp[0]);
		int kg = Integer.parseInt(tmp[1]);	
		
		int c = (kg + 100 - cm);
		
		System.out.println(c);
		if (c>0); {
			System.out.println("Obesity");
		}
	}

}
