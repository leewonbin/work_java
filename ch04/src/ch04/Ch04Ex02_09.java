package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		double avg = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			i= scanner.nextInt();
			if(i>100) {
				break;
			}
			else if(i<=100) {
				sum+= i;
				avg+= i;
				count++;
			}
		}
	System.out.println("sum :"+sum);
	System.out.println("avg :"+avg/count);
	}

}
