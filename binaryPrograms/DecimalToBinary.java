package binaryPrograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Decimal Number: ");
		String first = sc.nextLine();
		
		String printFinalNumber = deciToBin(first);
		System.out.println(printFinalNumber);
	
	}
	
	public static String deciToBin(String first) {
		int firstNumberBinary = Integer.parseInt(first, 10);
		return Integer.toBinaryString(firstNumberBinary);
	}

}
