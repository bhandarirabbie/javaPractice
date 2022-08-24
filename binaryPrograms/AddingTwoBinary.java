package binaryPrograms;

import java.util.Scanner;

public class AddingTwoBinary {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Binary World");
		System.out.println("Enter First Binary Numebr: ");
		String first = sc.nextLine();
		System.out.println("Enter Second Binary Number: ");
		String second = sc.nextLine();
		
		String addition = sum(first, second);
		
		System.out.println("Sum of given two binary are: " + addition);
		
	}
	public static String sum(String first, String second) {
		int firstBinary = Integer.parseInt(first, 2);
		int secondBinary = Integer.parseInt(second, 2);
		int sum = firstBinary + secondBinary;
		return Integer.toBinaryString(sum);
	}
}
