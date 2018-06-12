package ch04;

import java.util.Scanner;

public class Ch01Ex01_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 		
		
		int a = Integer.parseInt(tmp);		
		
		System.out.println(a);
		if(a<0) {
			System.out.println("minus");
		}
		
	}

}
