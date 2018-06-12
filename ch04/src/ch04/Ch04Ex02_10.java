package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			i= scanner.nextInt();
			if(i==0) {
				break;
			}else if (i%3==0) {
			}else if (i%5==0) {
			}else {
				a++;
			}
			}
	System.out.println(a);
	}
	}


