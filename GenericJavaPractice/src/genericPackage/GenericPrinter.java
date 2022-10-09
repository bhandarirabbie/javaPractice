package genericPackage;
public class GenericPrinter<T> {
	T valueToPrint;
	public GenericPrinter(T valueToPrint) {
		this.valueToPrint = valueToPrint;
	}
	public void print() {
		System.out.println(valueToPrint);
	}
}
