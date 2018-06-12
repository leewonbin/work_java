package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 		

		int a = Integer.parseInt(tmp);
		int b = 20-a;
		if(a>=20) {
			System.out.println("adult");
		}	else  {
			System.out.printf("%d years later", b);

		}

	}
}


