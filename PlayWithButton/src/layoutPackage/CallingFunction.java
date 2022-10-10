package layoutPackage;

public class CallingFunction {
	
	int initialValue;
	
	public CallingFunction(int initialValue) {
		this.initialValue = initialValue;
	}
	
	public int incrementCallFunction(int initialValue) {
		int returnIncrementValue = initialValue + 1;
		return returnIncrementValue;
	}
	
	public int decrementCallFunction(int initialValue) {
		int returnDecrementValue = initialValue - 1;
		return returnDecrementValue;
	}
	
}
