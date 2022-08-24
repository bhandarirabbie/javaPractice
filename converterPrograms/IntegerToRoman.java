package converterPrograms;

import java.util.Scanner;
import java.util.TreeMap;

public class IntegerToRoman {
	public final static String toRoman(int number, TreeMap<Integer, String> romanIdentifiers) {
		int l = romanIdentifiers.floorKey(number);
		if(number == l) {
			return romanIdentifiers.get(number);
		}
		return romanIdentifiers.get(l) + toRoman(number-l, romanIdentifiers);
	}
	public static void main(String[] args) {
		try (Scanner inputInteger = new Scanner(System.in)) {
			final TreeMap<Integer, String>
			romanIdentifiers = new TreeMap<Integer, String>();
			romanIdentifiers.put(1000, "M");
			romanIdentifiers.put(900, "CM");
			romanIdentifiers.put(500, "D");
			romanIdentifiers.put(400, "CD");
			romanIdentifiers.put(100, "C");
			romanIdentifiers.put(90, "XC");
			romanIdentifiers.put(50, "L");
			romanIdentifiers.put(40, "XL");
			romanIdentifiers.put(10, "X");
			romanIdentifiers.put(9, "IX");
			romanIdentifiers.put(5, "V");
			romanIdentifiers.put(4, "IV");
			romanIdentifiers.put(1, "I");
			int newNumber;
			do {
			System.out.print("Enter Integer: ");
			newNumber = inputInteger.nextInt();
			if(newNumber <=1000) {
			System.out.println("Int Representation of Number: " + newNumber);
			System.out.println("Roman Representation of Number: " + toRoman(newNumber, romanIdentifiers));
			} else {
				System.out.println("Please enter the integer below 1000. ");
				}
			} while(newNumber >1000);
		}
	}
}
