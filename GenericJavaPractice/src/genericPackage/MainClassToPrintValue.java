package genericPackage;
public class MainClassToPrintValue {
	public static void main(String[] args) {
		GenericPrinter<Integer> printer = new GenericPrinter<>(23);
		printer.print();
		
		GenericPrinter<String> printString = new GenericPrinter<>("We can also print String.");
		printString.print();
		
		GenericPrinter<Double> doublePrint = new GenericPrinter<>(2.22);
		doublePrint.print();
		
		GenericPrinter<Character> charPrint = new GenericPrinter<>('A');
		charPrint.print();
		
		/*
		With the help of Using Generics,
		it is possible to create classes that work with different data types.
		*/
	}
}
