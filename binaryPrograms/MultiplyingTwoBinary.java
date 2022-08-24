package binaryPrograms;

import java.util.Scanner;

public class MultiplyingTwoBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the binary world.");
		System.out.println("Enter your first binary number: ");
		String first = sc.nextLine();
		System.out.println("Enter your second binary number: ");
		String second = sc.nextLine();
		
		String multiplication = multiple(first, second);
		System.out.println("The multiplication of two given Binary Number are: " + multiplication);
		
	}
	public static String multiple(String first, String second) {
		int firstNumber = Integer.parseInt(first, 2);
		int secondNumber = Integer.parseInt(second, 2);
		int multiplicationOfTwoBinary = firstNumber * secondNumber;
		return Integer.toBinaryString(multiplicationOfTwoBinary);
	}

}
