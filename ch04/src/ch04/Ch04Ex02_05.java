package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		int i = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) {

			i = scanner.nextInt();
			if(i==-1) {
				break;
			}else if(i %3!=0) {
			}else if(i %3==0) {
				System.out.println(i/3);

			}
		}
	}

}
