package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		String[] words1 = input1.split("\\s");
		String[] words2 = input1.split("\\s");
		
		int minh = Integer.parseInt(words1[0]);
		int minw = Integer.parseInt(words1[1]);
		int gih = Integer.parseInt(words2[0]);
		int giw = Integer.parseInt(words2[1]);
		
		System.out.printf("%b", minh>gih && minw>giw);
		
		
		
		
		
		
		
	}

}
