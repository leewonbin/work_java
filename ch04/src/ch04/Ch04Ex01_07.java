package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine(); 		
		

		
		if(a.equals("A")) {
			System.out.println("Excellent");
		}else if(a.equals("B")) {
			System.out.println("GOOD");
		}else if(a.equals("C")) {
			System.out.println("Usually");
		}else if(a.equals("D")) {
			System.out.println("Effort");
		}else if(a.equals("F")) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
		
	}

}
