package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Korea");
		System.out.println("2.USA");
		System.out.println("3.Japan");
		System.out.println("4.China");
		System.out.println("nmber?");
		i = scanner.nextInt();
		if(i==1) {
			System.out.println("Seoul");
		}else if (i==2) {
			System.out.println("USA");
		}else if (i==3) {
			System.out.println("Japan");
		}else if (i==4) {
			System.out.println("China");
		}else {
			System.out.println("none");
		}
	}

}
