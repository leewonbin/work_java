package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" "); 		
		
		double a = Double.parseDouble(tmp[0]);
		double b = Double.parseDouble(tmp[1]);
		
		if(4.0<=a && 4.0<=b) {
			System.out.println("A");
		} else if(3.0<=a && 3.0<=b) {
			System.out.println("B");
		} else if (a<3.0 || b<3.0) {
			System.out.println("C");
		}
	}

}
